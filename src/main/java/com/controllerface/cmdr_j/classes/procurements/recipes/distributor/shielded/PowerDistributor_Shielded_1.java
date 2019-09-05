package com.controllerface.cmdr_j.classes.procurements.recipes.distributor.shielded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_Shielded_1 extends AbstractModificationRecipe
{
    public PowerDistributor_Shielded_1()
    {
        super(PowerDistributor_Shielded_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 40d),
                                new ItemEffectData(ItemEffect.Mass, 3d),
                                new ItemEffectData(ItemEffect.PowerDraw, -10d)
                        ),
                new CostData(Material.WORNSHIELDEMITTERS, 1));
    }
}