package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_8C_BiWeave extends AbstractShieldGenerator
{
    public ShieldGenerator_8C_BiWeave()
    {
        super("Bi-Weave Shield Generator",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 160.0),
                        new ItemEffectData(ItemEffect.Integrity, 150.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 4.0),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900.0),
                        new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800.0),
                        new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500.0),
                        new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40.0),
                        new ItemEffectData(ItemEffect.ShieldGenStrength, 90.0),
                        new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140.0),
                        new ItemEffectData(ItemEffect.RegenRate, 5.8),
                        new ItemEffectData(ItemEffect.BrokenRegenRate, 14.4),
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
        return 27_097_750;
    }
}