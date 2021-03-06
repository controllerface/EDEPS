package com.controllerface.cmdr_j.classes.modules.weapons.gausscannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianGaussCannon_Small extends AbstractGuardianModule
{
    public FixedGuardianGaussCannon_Small()
    {
        super("Gauss Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.91),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 26.5),
                        new ItemEffectData(ItemEffect.Damage, 22.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 3.80),
                        new ItemEffectData(ItemEffect.ThermalLoad, 25.0),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 140.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.2048),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 80.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 1.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 11.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 20.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal/AX"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1500.0)
                ));
    }

    @Override
    public long price()
    {
        return 167_250;
    }
}