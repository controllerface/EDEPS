package com.controllerface.cmdr_j.classes.modules.utility.killwarrant;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Kill_warrantScanner_0A extends AbstractKillWarrantScanner
{
    public Kill_warrantScanner_0A()
    {
        super("0A Kill_warrant Scanner", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.3),
                  new ItemEffectData(ItemEffect.Integrity, 48.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 3.2),
                  new ItemEffectData(ItemEffect.BootTime, 2.0),
                  new ItemEffectData(ItemEffect.ScannerRange, 4000.0),
                  new ItemEffectData(ItemEffect.MaxAngle, 15.0),
                  new ItemEffectData(ItemEffect.ScannerTimeToScan, 10.0)
            ));
    }

    @Override
    public long price()
    {
        return 1_097_100;
    }
}