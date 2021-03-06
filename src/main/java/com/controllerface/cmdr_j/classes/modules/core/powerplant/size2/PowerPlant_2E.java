package com.controllerface.cmdr_j.classes.modules.core.powerplant.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_2E extends AbstractPowerPlant
{
    public PowerPlant_2E()
    {
        super("2E Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 46.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 6.4),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 1.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_980;
    }
}