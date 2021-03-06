package com.controllerface.cmdr_j.classes.modules.core.thrusters.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_4D extends AbstractThrusters
{
    public Thrusters_4D()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 4.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 4.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 3.69),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 158.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 315.0),
                new ItemEffectData(ItemEffect.MaximumMass, 473.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 86.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 106.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 59_630;
    }
}