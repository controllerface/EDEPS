package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Large_Calibre_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public Large_Calibre_Munitions_Premium()
    {
        super("Large Calibre Munitions [Premium]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, "synthesized"),
                  new ItemEffectData(ItemEffect.Damage_Boost, 30.0)
            ),
            new CostData(Material.ZINC, 8),
            new CostData(Material.TUNGSTEN, 2),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.MERCURY, 1),
            new CostData(Material.ANTIMONY, 2));
    }
}