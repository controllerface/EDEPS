package com.controllerface.cmdr_j.classes.modules.core.sensors.size6;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;

public class Sensors_6D extends AbstractSensors
{
    public Sensors_6D()
    {
        super("6D Standard Sensors", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 90.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.45),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 5400.0)
            ));
    }
}