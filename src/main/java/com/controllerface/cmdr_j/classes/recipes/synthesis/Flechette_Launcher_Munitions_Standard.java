package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Flechette_Launcher_Munitions_Standard extends AbstractSynthesisRecipe_Standard
{
    public Flechette_Launcher_Munitions_Standard()
    {
        super("Flechette Launcher Munitions [Standard]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, "synthesized"),
                  new ItemEffectData(ItemEffect.Damage_Boost, 5.0)
            ),
            new CostData(Material.TUNGSTEN, 4),
            new CostData(Material.ELECTROCHEMICALARRAYS, 6),
            new CostData(Material.MECHANICALCOMPONENTS, 4),
            new CostData(Material.BORON, 4));
    }
}