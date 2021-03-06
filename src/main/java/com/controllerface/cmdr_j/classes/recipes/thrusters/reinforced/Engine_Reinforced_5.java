package com.controllerface.cmdr_j.classes.recipes.thrusters.reinforced;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Reinforced_5 extends AbstractModificationRecipe
{
    public Engine_Reinforced_5()
    {
        super(Engine_Reinforced_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 110d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 25d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -50d)
                        ),
                new CostData(Material.HEATEXCHANGERS, 1),
                new CostData(Material.IMPERIALSHIELDING, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1));
    }
}
