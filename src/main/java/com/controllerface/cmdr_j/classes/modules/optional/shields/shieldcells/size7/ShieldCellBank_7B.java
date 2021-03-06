package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_7B extends AbstractShieldCellBank
{
    public ShieldCellBank_7B()
    {
        super("7B Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 128.0),
                        new ItemEffectData(ItemEffect.Integrity, 183.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 2.48),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 49.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 720.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 11.4)
                ));
    }

    @Override
    public long price()
    {
        return 3_892_770;
    }
}