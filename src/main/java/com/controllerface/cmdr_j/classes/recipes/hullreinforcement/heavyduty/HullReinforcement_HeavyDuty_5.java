package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.heavyduty;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_HeavyDuty_5 extends AbstractModificationRecipe
{
    public HullReinforcement_HeavyDuty_5()
    {
        super(HullReinforcement_HeavyDuty_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 15d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, 72d),
                                new ItemEffectData(ItemEffect.KineticResistance, 15d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 40d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 15d)
                        ),
                new CostData(Material.COMPOUNDSHIELDING, 1),
                new CostData(Material.FEDCORECOMPOSITES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
