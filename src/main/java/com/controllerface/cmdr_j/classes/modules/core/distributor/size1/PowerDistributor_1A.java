package com.controllerface.cmdr_j.classes.modules.core.distributor.size1;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;

public class PowerDistributor_1A extends AbstractPowerDistributor
{
    public PowerDistributor_1A()
    {
        super("1A Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.3),
                  new ItemEffectData(ItemEffect.Integrity, 44.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.48),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 14.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 1.8),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 12.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 0.6),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 12.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 0.6)
            ));
    }
}