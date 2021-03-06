package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ThermalSpread_Engine extends AbstractExperimentalRecipe
{
    public ThermalSpread_Engine()
    {
        super("Thermal Spread", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass_Percent, 5.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate_Percent, -10.0)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.HEATVANES, 1));
    }
}