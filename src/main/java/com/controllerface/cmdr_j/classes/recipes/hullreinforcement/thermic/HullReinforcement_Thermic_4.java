package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.thermic;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Thermic_4 extends AbstractModificationRecipe
{
    public HullReinforcement_Thermic_4()
    {
        super(HullReinforcement_Thermic_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -8d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, 12d),
                                new ItemEffectData(ItemEffect.KineticResistance, -8d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 33d)
                        ),
                new CostData(Material.GALVANISINGALLOYS, 1),
                new CostData(Material.HEATVANES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
