package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedAdvancedMissileRack_Small extends AbstractMissileRack
{
    public FixedAdvancedMissileRack_Small()
    {
        super("Advanced Missile Rack",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.4),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 25.0),
                        new ItemEffectData(ItemEffect.Damage, 50.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                        new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 750.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 8.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 16.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 20.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.DamageType, "Explosive"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed")
                ));
    }

    @Override
    public long price()
    {
        return 32_175;
    }
}