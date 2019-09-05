package com.controllerface.cmdr_j.classes.procurements.modules.passengercabin.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Cabin_4C extends AbstractCabin
{
    public Cabin_4C()
    {
        super("4C First Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 10d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 3d),
                        new ItemEffectData(ItemEffect.CabinClass, "First")
                ));
    }
}