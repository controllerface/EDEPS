package com.controllerface.cmdr_j.classes.modules.utility.shieldbooster;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldBooster_0B extends AbstractShieldBooster
{
    public ShieldBooster_0B()
    {
        super("0B Shield Booster",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 3.0),
                        new ItemEffectData(ItemEffect.Integrity, 45.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.0),
                        new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 16.0),
                        new ItemEffectData(ItemEffect.KineticResistance, 0.0),
                        new ItemEffectData(ItemEffect.ThermicResistance, 0.0),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 0.0)
                ));
    }

    @Override
    public long price()
    {
        return 122_000;
    }
}