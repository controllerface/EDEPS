package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFM_Refill_Basic extends AbstractSynthesisRecipe_Basic
{
    public AFM_Refill_Basic()
    {
        super("AFM Refill [Basic]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, "synthesized")
            ),
            new CostData(Material.NICKEL, 2),
            new CostData(Material.ZINC, 2),
            new CostData(Material.CHROMIUM, 2),
            new CostData(Material.VANADIUM, 3));
    }
}