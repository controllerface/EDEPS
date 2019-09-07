package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Explosives_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public Explosives_Munitions_Premium()
    {
        super("Explosives Munitions Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 30.0)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.ARSENIC, 4),
            new CostData(Material.NIOBIUM, 5),
            new CostData(Material.MERCURY, 5),
            new CostData(Material.POLONIUM, 5));
    }
}