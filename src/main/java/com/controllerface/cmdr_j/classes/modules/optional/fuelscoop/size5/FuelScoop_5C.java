package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_5C extends AbstractFuelScoop
{
    public FuelScoop_5C()
    {
        super("5C Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 96d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.412d)
                ));
    }
}
