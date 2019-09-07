package com.controllerface.cmdr_j.classes.modules.core.powerplant.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_7D extends AbstractPowerPlant
{
    public PowerPlant_7D()
    {
        super("7D Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 32.0),
                  new ItemEffectData(ItemEffect.Integrity, 105.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 22.5),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.75)
            ));
    }
}