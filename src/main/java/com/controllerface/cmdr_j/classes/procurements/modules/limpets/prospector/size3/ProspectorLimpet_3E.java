package com.controllerface.cmdr_j.classes.procurements.modules.limpets.prospector.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.limpets.prospector.AbstractProspectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ProspectorLimpet_3E extends AbstractProspectorLimpet
{
    public ProspectorLimpet_3E()
    {
        super("3E Prospector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 5d),
                        new ItemEffectData(ItemEffect.Integrity, 38d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.27d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }
}
