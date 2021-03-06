package com.controllerface.cmdr_j.classes.modules.core.powerplant.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianHybridPowerPlant_5A extends AbstractGuardianModule
{
    public GuardianHybridPowerPlant_5A()
    {
        super("Hybrid Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 11.7),
                        new ItemEffectData(ItemEffect.Integrity, 106.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 26.9),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
                ));
    }

    @Override
    public long price()
    {
        return 661_353;
    }
}