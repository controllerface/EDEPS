package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_7B extends AbstractFuelScoop
{
    public FuelScoop_7B()
    {
        super("7B Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Integrity, 183d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.83d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 1.068d)
                ));
    }

    @Override
    public long price()
    {
        return 22_795_160;
    }
}
