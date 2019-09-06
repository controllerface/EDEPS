package com.controllerface.cmdr_j.classes.modules.core.fsd.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FrameShiftDrive_3A extends AbstractFSD
{
    public FrameShiftDrive_3A()
    {
        super("3A Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.Integrity, 80.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.45),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 150.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 14.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 1.8)
            ));
    }
}