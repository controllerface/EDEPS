package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedAntiThargoidMissileRack_Large extends AbstractExperimentalModule
{
    public FixedAntiThargoidMissileRack_Large()
    {
        super("Anti-Thargoid Missile Rack",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1.0),
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.62),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 32.0),
                        new ItemEffectData(ItemEffect.Damage, 64.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                        new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 750.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 12.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 128.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.1),
                        new ItemEffectData(ItemEffect.MinBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.DamageType, "Explosive/AX"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed")
                ));
    }

    @Override
    public long price()
    {
        return 1_318_444;
    }
}