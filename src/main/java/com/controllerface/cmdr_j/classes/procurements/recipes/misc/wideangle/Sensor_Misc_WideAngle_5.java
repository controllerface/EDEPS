package com.controllerface.cmdr_j.classes.procurements.recipes.misc.wideangle;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_Misc_WideAngle_5 extends AbstractModifcationRecipe
{
    public Sensor_Misc_WideAngle_5()
    {
        super(Sensor_Misc_WideAngle_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 100d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, 200d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan, 50d)
                        ),
                new CostData(Material.CLASSIFIEDSCANDATA, 1),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.TIN, 1));
    }
}
