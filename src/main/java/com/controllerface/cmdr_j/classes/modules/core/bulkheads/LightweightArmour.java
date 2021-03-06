package com.controllerface.cmdr_j.classes.modules.core.bulkheads;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LightweightArmour extends AbstractBulkheads
{
    private final long price;

    public LightweightArmour(String ship, long price)
    {
        super(ship + " Lightweight Armour",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 0.0),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, -40.0),
                        new ItemEffectData(ItemEffect.KineticResistance, -20.0),
                        new ItemEffectData(ItemEffect.ThermicResistance, 0.0),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 80.0)
                ));
        this.price = price;
    }

    @Override
    public long price()
    {
        return price;
    }
}