package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianMRP_5E extends AbstractGuardianModule
{
    public GuardianMRP_5E()
    {
        super("Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 32d),
                        new ItemEffectData(ItemEffect.Integrity, 424d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.81d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }

    @Override
    public long price()
    {
        return 331_776;
    }
}
