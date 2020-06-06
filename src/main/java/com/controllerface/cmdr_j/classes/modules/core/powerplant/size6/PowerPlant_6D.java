package com.controllerface.cmdr_j.classes.modules.core.powerplant.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_6D extends AbstractPowerPlant
{
    public PowerPlant_6D()
    {
        super("6D Power Plant",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 90.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 18.9),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.75)
            ));
    }

    @Override
    public long price()
    {
        return 599_240;
    }
}