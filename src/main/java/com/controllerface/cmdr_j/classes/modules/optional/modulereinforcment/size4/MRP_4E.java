package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.AbstractModulePackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MRP_4E extends AbstractModulePackage
{
    public MRP_4E()
    {
        super("4E Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 16d),
                        new ItemEffectData(ItemEffect.Integrity, 260d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }

    @Override
    public long price()
    {
        return 65_000;
    }
}
