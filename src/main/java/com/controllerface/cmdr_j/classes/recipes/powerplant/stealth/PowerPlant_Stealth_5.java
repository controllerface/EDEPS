package com.controllerface.cmdr_j.classes.recipes.powerplant.stealth;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Stealth_5 extends AbstractModificationRecipe
{
    public PowerPlant_Stealth_5()
    {
        super(PowerPlant_Stealth_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency_Percent, -65d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 20d),
                                new ItemEffectData(ItemEffect.PowerCapacity_Percent, -15d)
                        ),
                new CostData(Material.PROTOHEATRADIATORS, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.DECODEDEMISSIONDATA, 1));
    }
}
