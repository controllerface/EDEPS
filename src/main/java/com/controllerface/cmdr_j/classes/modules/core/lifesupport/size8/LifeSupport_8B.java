package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_8B extends AbstractLifeSupport
{
    public LifeSupport_8B()
    {
        super("8B Standard Life Support", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 256.0),
                  new ItemEffectData(ItemEffect.Integrity, 165.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.1),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 900.0)
            ));
    }
}