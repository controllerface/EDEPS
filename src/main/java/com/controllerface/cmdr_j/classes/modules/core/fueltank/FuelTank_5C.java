package com.controllerface.cmdr_j.classes.modules.core.fueltank;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelTank_5C extends AbstractFuelTank
{
    public FuelTank_5C()
    {
        super("5C Standard Fuel Tank", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.FuelCapacity, 32.0)
            ));
    }
}