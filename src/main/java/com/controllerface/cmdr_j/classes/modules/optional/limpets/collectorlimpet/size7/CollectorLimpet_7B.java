package com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.AbstractCollectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CollectorLimpet_7B extends AbstractCollectorLimpet
{
    public CollectorLimpet_7B()
    {
        super("7B Collector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 128d),
                        new ItemEffectData(ItemEffect.Integrity, 157d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.83d),
                        new ItemEffectData(ItemEffect.BootTime, 6d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2380d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 420d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
                ));
    }

    @Override
    public long price()
    {
        return 3_499_200;
    }
}
