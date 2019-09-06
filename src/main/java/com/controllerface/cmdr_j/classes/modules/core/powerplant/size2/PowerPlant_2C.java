package com.controllerface.cmdr_j.classes.modules.core.powerplant.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class PowerPlant_2C extends AbstractPowerPlant
{
    public PowerPlant_2C()
    {
        super("2C Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.3),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 8.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
            ));
    }
}