package com.controllerface.cmdr_j.classes.modules.optional.afmu.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFMU_4C extends AbstractAFMU
{
    public AFMU_4C()
    {
        super("4C Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Integrity, 80d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.65d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 4900d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.02d)
                ));
    }

    @Override
    public long price()
    {
        return 524_880;
    }
}
