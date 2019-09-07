package com.controllerface.cmdr_j.classes.recipes.misc.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Misc_Reinforced_3 extends AbstractModificationRecipe
{
    public Misc_Reinforced_3()
    {
        super(Misc_Reinforced_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 180d),
                                new ItemEffectData(ItemEffect.Mass, 90d)
                        ),
                new CostData(Material.NICKEL, 1),
                new CostData(Material.SHIELDEMITTERS, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
