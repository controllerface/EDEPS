package com.controllerface.cmdr_j.classes.modules.core.fsd.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_7D extends AbstractFSD
{
    public FrameShiftDrive_7D()
    {
        super("7D Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 105.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.54),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 1620.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 43.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 8.5)
                ));
    }

    @Override
    public long price()
    {
        return 1_899_600;
    }
}