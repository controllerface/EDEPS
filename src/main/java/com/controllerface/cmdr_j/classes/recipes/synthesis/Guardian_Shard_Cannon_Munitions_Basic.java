package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Shard_Cannon_Munitions_Basic extends AbstractSynthesisRecipe_Basic
{
    public Guardian_Shard_Cannon_Munitions_Basic()
    {
        super("Guardian Shard Cannon Munitions [Basic]",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Rearm, "synthesized")
                ),
                new CostData(Material.CARBON, 3),
                new CostData(Material.VANADIUM, 2),
                new CostData(Material.CRYSTALSHARDS, 3),
                new CostData(Material.GUARDIAN_POWERCELL, 3),
                new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 5));
    }
}