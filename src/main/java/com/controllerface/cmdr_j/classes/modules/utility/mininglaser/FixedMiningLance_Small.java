package com.controllerface.cmdr_j.classes.modules.utility.mininglaser;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedMiningLance_Small extends AbstractMiningLaser
{
    public FixedMiningLance_Small()
    {
        super("Mining Lance",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.7),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 8.0),
                        new ItemEffectData(ItemEffect.Damage, 8.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 1.75),
                        new ItemEffectData(ItemEffect.ThermalLoad, 6.0),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 18.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 2000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.7976931348623157E308),
                        new ItemEffectData(ItemEffect.BreachDamage, 1.2),
                        new ItemEffectData(ItemEffect.MinBreachChance, 10.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 20.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 300.0)
                ));
    }

    @Override
    public long price()
    {
        return 13_600;
    }
}