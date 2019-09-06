package com.controllerface.cmdr_j.classes.modules.core.thrusters.size6;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;

public class Thrusters_6C extends AbstractThrusters
{
    public Thrusters_6C()
    {
        super("6C Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 113.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 6.3),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 600.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 1200.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 1800.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 90.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 110.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}