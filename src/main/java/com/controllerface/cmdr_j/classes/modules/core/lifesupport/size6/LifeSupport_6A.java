package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_6A extends AbstractLifeSupport
{
    public LifeSupport_6A()
    {
        super("6A Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 40.0),
                        new ItemEffectData(ItemEffect.Integrity, 136.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.96),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 1500.0)
                ));
    }

    @Override
    public long price()
    {
        return 3_475_690;
    }
}