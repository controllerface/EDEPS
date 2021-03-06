package com.controllerface.cmdr_j.classes.recipes.misc.fastscan;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_Misc_FastScan_5 extends AbstractModificationRecipe
{
    public Sensor_Misc_FastScan_5()
    {
        super(Sensor_Misc_FastScan_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -50d),
                                new ItemEffectData(ItemEffect.Range_Percent, -25d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan_Percent, -80d)
                        ),
                new CostData(Material.ADAPTIVEENCRYPTORS, 1),
                new CostData(Material.ARSENIC, 1),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1));
    }
}
