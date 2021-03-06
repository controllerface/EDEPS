package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class IncendiaryRounds extends AbstractExperimentalRecipe
{
    public IncendiaryRounds()
    {
        super("Incendiary Rounds", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Damage_Partially_Thermal, 90.0),
                  new ItemEffectData(ItemEffect.RateOfFire_Percent, -5.26),
                  new ItemEffectData(ItemEffect.ThermalLoad_Percent, 200.0)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.PHASEALLOYS, 3));
    }
}