package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class OverloadMunitions extends AbstractExperimentalRecipe
{
    public OverloadMunitions()
    {
        super("Overload Munitions", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Damage_Partially_Thermal, 50.0)
            ),
            new CostData(Material.FILAMENTCOMPOSITES, 5),
            new CostData(Material.ENCRYPTIONCODES, 4),
            new CostData(Material.SHIELDPATTERNANALYSIS, 2),
            new CostData(Material.GERMANIUM, 3));
    }
}