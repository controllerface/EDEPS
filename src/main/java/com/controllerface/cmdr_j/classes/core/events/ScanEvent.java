package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.data.ScannedBody;
import com.controllerface.cmdr_j.classes.data.StellarBody;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ScanEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var bodyType = determineBodyType(event);
        var bodyName = ((String) event.remove("BodyName"));
        var bodyId = ((Number) event.remove("BodyID")).intValue();
        var address = ((Number) event.remove("SystemAddress")).longValue();

        event.remove("event");
        event.remove("WasDiscovered");
        event.remove("WasMapped");
        event.remove("StarSystem");

        var scannedBody = new ScannedBody(bodyType, bodyName, bodyId, address, event);

        gameState.discoverStellarBody(scannedBody);
        gameState.emitCartographyData();
    }

    @SuppressWarnings("unchecked")
    private StellarBody.BodyType determineBodyType(Map<String, Object> event)
    {
        // star type is the simplest
        if (event.get("StarType") != null)
        {
            if (event.get("StarType").equals("H"))
            {
                return StellarBody.BodyType.BlackHole;
            }
            else return StellarBody.BodyType.Star;
        }

        var parents = ((List<Map<String, Object>>) event.get("Parents"));

        // this is a guess for sure, have not see a rogue planet in game, may not actually exist
        if (parents == null)
        {
            return StellarBody.BodyType.RoguePlanet;
        }

        var bodyName = ((String) event.get("BodyName"));
        var systemName = ((String) event.get("StarSystem"));
        if (event.get("PlanetClass") != null)
        {
            if (parents.get(0).get("Planet") != null)
            {
                return StellarBody.BodyType.Moon;
            }
            else
            {
                return StellarBody.BodyType.Planet;
            }
        }
        else
        {
            if (bodyName.contains("Cluster"))
            {
                return StellarBody.BodyType.AsteroidCluster;
            }
            else if (bodyName.contains(systemName) && bodyName.contains("Ring"))
            {
                if (parents.get(0).get("Planet") != null)
                {
                    return StellarBody.BodyType.PlanetaryRing;
                }
                else
                {
                    return StellarBody.BodyType.StellarRing;
                }
            }
            else
            {
                // todo: might be others to account for (Null/barycentre, Station)
                return StellarBody.BodyType.Unknown;
            }
        }
    }
}
