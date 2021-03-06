package com.controllerface.cmdr_j.classes.recipes.fsd.shielded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_Shielded_3 extends AbstractModificationRecipe
{
    public FSD_Shielded_3()
    {
        super(FSD_Shielded_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 75d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 12d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 9d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -20d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDINGSENSORS, 1),
                new CostData(Material.ZINC, 1));
    }
}
