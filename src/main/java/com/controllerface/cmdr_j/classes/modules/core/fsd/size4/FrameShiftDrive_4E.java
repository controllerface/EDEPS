package com.controllerface.cmdr_j.classes.modules.core.fsd.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_4E extends AbstractFSD
{
    public FrameShiftDrive_4E()
    {
        super("4E Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 10.0),
                        new ItemEffectData(ItemEffect.Integrity, 72.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.24),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 280.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 18.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 2.0)
                ));
    }

    @Override
    public long price()
    {
        return 19_880;
    }
}