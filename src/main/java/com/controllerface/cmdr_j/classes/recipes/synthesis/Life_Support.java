package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Life_Support extends AbstractSynthesisRecipe_Basic
{
    public Life_Support()
    {
        super("Life Support", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, 0.0)
            ),
            new CostData(Material.IRON, 2),
            new CostData(Material.NICKEL, 1));
    }
}