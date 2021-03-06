package com.controllerface.cmdr_j.classes.recipes.thrusters.clean;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Tuned_1 extends AbstractModificationRecipe
{
    public Engine_Tuned_1()
    {
        super(Engine_Tuned_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EngineOptimalMass_Percent, -2d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 8d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -20d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
