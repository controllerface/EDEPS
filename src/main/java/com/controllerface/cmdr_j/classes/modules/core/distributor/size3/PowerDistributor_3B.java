package com.controllerface.cmdr_j.classes.modules.core.distributor.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_3B extends AbstractPowerDistributor
{
    public PowerDistributor_3B()
    {
        super("3B Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 77.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.55),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 22.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 2.5),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 17.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 1.2),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 17.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 1.2)
                ));
    }

    @Override
    public long price()
    {
        return 63_330;
    }
}