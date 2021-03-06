package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_1E extends AbstractFuelScoop
{
    public FuelScoop_1E()
    {
        super("1E Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Integrity, 32d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.14d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.018d)
                ));
    }

    @Override
    public long price()
    {
        return 310;
    }
}
