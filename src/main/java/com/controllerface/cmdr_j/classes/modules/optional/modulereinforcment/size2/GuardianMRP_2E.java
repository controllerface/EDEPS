package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianMRP_2E extends AbstractGuardianModule
{
    public GuardianMRP_2E()
    {
        super("Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.Integrity, 127d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }

    @Override
    public long price()
    {
        return 24_000;
    }
}
