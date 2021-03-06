package com.controllerface.cmdr_j.classes.recipes.powerplant.boosted;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Boosted_4 extends AbstractModificationRecipe
{
    public PowerPlant_Boosted_4()
    {
        super(PowerPlant_Boosted_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency_Percent, 20d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -20d),
                                new ItemEffectData(ItemEffect.PowerCapacity_Percent, 33d)
                        ),
                new CostData(Material.CADMIUM, 1),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.HEATDISPERSIONPLATE, 1));
    }
}
