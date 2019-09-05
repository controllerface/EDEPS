package com.controllerface.cmdr_j.classes.procurements.modules.afmu.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class AFMU_7A extends AbstractAFMU
{
    public AFMU_7A()
    {
        super("7A Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 151d),
                        new ItemEffectData(ItemEffect.PowerDraw, 3.68d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 9600d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.028d)
                ));
    }
}
