package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ConcordantSequence extends AbstractExperimentalRecipe
{
    public ConcordantSequence()
    {
        super("Concordant Sequence", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Wing_Shield_Regeneration_Increased, 0.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 50.0)
            ),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.EMBEDDEDFIRMWARE, 3),
            new CostData(Material.ZIRCONIUM, 1));
    }
}