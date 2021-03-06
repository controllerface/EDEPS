package com.controllerface.cmdr_j.classes.modules.core.powerplant.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_6E extends AbstractPowerPlant
{
    public PowerPlant_6E()
    {
        super("6E Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 40.0),
                        new ItemEffectData(ItemEffect.Integrity, 102.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 16.8),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 1.0)
                ));
    }

    @Override
    public long price()
    {
        return 199_750;
    }
}