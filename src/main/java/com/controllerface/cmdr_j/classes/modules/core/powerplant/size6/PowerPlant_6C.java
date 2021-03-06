package com.controllerface.cmdr_j.classes.modules.core.powerplant.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_6C extends AbstractPowerPlant
{
    public PowerPlant_6C()
    {
        super("6C Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 113.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 2.1),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
                ));
    }

    @Override
    public long price()
    {
        return 1_797_730;
    }
}