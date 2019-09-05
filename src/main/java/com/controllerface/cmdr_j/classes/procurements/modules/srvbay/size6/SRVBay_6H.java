package com.controllerface.cmdr_j.classes.procurements.modules.srvbay.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.srvbay.AbstractSRVBay;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class SRVBay_6H extends AbstractSRVBay
{
    public SRVBay_6H()
    {
        super("6H Planetary Vehicle Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 34d),
                        new ItemEffectData(ItemEffect.Integrity, 30d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 4d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
                ));
    }
}
