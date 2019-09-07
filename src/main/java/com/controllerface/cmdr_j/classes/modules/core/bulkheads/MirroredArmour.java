package com.controllerface.cmdr_j.classes.modules.core.bulkheads;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MirroredArmour extends AbstractBulkheads
{
    public MirroredArmour()
    {
        super("Mirrored Armour", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, -50.0),
                  new ItemEffectData(ItemEffect.KineticResistance, -75.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, 50.0),
                  new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 250.0)
            ));
    }
}