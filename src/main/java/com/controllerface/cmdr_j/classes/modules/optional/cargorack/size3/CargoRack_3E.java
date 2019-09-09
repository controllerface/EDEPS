package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_3E extends AbstractCargoRack
{
    public CargoRack_3E()
    {
        super("3E Cargo Rack", new ItemEffects(new ItemEffectData(ItemEffect.CargoCapacity, 8d)));
    }
}