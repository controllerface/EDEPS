package com.controllerface.cmdr_j.classes.procurements.modules.afmu.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class AFMU_3E extends AbstractAFMU
{
    public AFMU_3E()
    {
        super("3E Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 51d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.81d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 3600d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.012d)
                ));
    }
}
