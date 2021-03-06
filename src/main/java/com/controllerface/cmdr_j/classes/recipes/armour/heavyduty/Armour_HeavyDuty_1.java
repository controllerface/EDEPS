package com.controllerface.cmdr_j.classes.recipes.armour.heavyduty;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Armour_HeavyDuty_1 extends AbstractModificationRecipe
{
    public Armour_HeavyDuty_1()
    {
        super(Armour_HeavyDuty_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 1d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 12d),
                                new ItemEffectData(ItemEffect.KineticResistance, 1d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 1d)
                        ),
                new CostData(Material.CARBON, 1));
    }
}
