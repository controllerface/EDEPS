package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class RestockVehicleEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var cost = ((Number) event.get("Cost")).intValue();
        var count = ((Number) event.get("Count")).intValue();
        gameState.adjustCreditBalance(-1 * (cost * count));
    }
}
