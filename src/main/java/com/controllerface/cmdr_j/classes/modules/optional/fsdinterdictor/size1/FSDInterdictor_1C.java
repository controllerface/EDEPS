package com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.AbstractFSDInterdictor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSDInterdictor_1C extends AbstractFSDInterdictor
{
    public FSDInterdictor_1C()
    {
        super("1C Frame Shift Drive Interdictor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 40d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.23d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDInterdictorRange, 5d),
                        new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 50d)
                ));
    }

    @Override
    public long price()
    {
        return 108_000;
    }
}
