package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_5D extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_5D()
    {
        super("5D Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.Integrity, 58d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 6d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2640d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 10d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 2d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 7d)
                ));
    }

    @Override
    public long price()
    {
        return 97_200;
    }
}
