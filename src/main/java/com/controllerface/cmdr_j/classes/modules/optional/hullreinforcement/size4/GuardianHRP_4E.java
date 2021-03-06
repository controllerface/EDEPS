package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianHRP_4E extends AbstractGuardianModule
{
    public GuardianHRP_4E()
    {
        super("Guardian Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 16d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.13d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 2d),
                        new ItemEffectData(ItemEffect.CausticResistance, 5d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 375d)
                ));
    }

    @Override
    public long price()
    {
        return 138_240;
    }
}
