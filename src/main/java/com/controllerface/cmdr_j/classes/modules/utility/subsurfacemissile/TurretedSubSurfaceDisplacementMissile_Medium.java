package com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedSubSurfaceDisplacementMissile_Medium extends AbstractSubsurfaceMissileLauncher
{
    public TurretedSubSurfaceDisplacementMissile_Medium()
    {
        super("2B Turreted Sub-Surface Displacement Missile",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.93),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 2.5),
                        new ItemEffectData(ItemEffect.Damage, 5.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 550.0),
                        new ItemEffectData(ItemEffect.BurstSize, 1.0),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, -1.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 96.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 2.0),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 1.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.18),
                        new ItemEffectData(ItemEffect.ThermalLoad, 2.9),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 25.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.5),
                        new ItemEffectData(ItemEffect.Jitter, 0.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 10.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 20.0),
                        new ItemEffectData(ItemEffect.DamageType, "Explosive"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret")
                ));
    }

    @Override
    public long price()
    {
        return 381_750;
    }
}