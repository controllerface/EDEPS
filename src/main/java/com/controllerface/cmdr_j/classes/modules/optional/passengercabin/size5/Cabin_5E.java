package com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Cabin_5E extends AbstractCabin
{
    public Cabin_5E()
    {
        super("Economy Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 16d),
                        new ItemEffectData(ItemEffect.CabinClass, "Economy")
                ));
    }

    @Override
    public long price()
    {
        return 34960;
    }
}
