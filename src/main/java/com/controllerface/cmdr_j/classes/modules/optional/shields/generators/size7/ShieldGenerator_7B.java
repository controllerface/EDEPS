package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_7B extends AbstractShieldGenerator
{
    public ShieldGenerator_7B()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 7.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 128.0),
                new ItemEffectData(ItemEffect.Integrity, 183.0),
                new ItemEffectData(ItemEffect.PowerDraw, 4.2),
                new ItemEffectData(ItemEffect.BootTime, 1.0),
                new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530.0),
                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060.0),
                new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650.0),
                new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60.0),
                new ItemEffectData(ItemEffect.ShieldGenStrength, 110.0),
                new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160.0),
                new ItemEffectData(ItemEffect.RegenRate, 1.8),
                new ItemEffectData(ItemEffect.BrokenRegenRate, 7.33),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
        ));
    }

    @Override
    public long price()
    {
        return 17_096_370;
    }
}