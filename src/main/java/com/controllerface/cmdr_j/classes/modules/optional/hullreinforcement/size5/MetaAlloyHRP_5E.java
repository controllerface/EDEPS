package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MetaAlloyHRP_5E extends AbstractHumanModule
{
    public MetaAlloyHRP_5E()
    {
        super("Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1d),
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 32d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 324d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }

    @Override
    public long price()
    {
        return 225_001;
    }
}
