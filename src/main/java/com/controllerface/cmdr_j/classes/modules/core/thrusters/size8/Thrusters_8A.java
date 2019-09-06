package com.controllerface.cmdr_j.classes.modules.core.thrusters.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;

public class Thrusters_8A extends AbstractThrusters
{
    public Thrusters_8A()
    {
        super("8A Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 160.0),
                  new ItemEffectData(ItemEffect.Integrity, 165.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 10.8),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 1680.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 3360.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 5040.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 96.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 116.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}