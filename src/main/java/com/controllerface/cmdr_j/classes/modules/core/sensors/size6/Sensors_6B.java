package com.controllerface.cmdr_j.classes.modules.core.sensors.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_6B extends AbstractSensors
{
    public Sensors_6B()
    {
        super("6B Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 64.0),
                        new ItemEffectData(ItemEffect.Integrity, 136.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.83),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 6600.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_390_280;
    }
}