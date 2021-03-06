package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Heat_Sink_Standard extends AbstractSynthesisRecipe_Standard
{
    public Heat_Sink_Standard()
    {
        super("Heat Sink [Standard]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, "synthesized"),
                  new ItemEffectData(ItemEffect.Heat_Dissipation_Increase, 15.0)
            ),
            new CostData(Material.BASICCONDUCTORS, 2),
            new CostData(Material.HEATCONDUCTIONWIRING, 2),
            new CostData(Material.HEATEXCHANGERS, 2));
    }
}