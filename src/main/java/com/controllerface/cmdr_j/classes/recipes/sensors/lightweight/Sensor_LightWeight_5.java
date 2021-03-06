package com.controllerface.cmdr_j.classes.recipes.sensors.lightweight;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_LightWeight_5 extends AbstractModificationRecipe
{
    public Sensor_LightWeight_5()
    {
        super(Sensor_LightWeight_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -50d),
                                new ItemEffectData(ItemEffect.Mass_Percent, -80d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle_Percent, -25d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.PROTOLIGHTALLOYS, 1),
                new CostData(Material.PROTORADIOLICALLOYS, 1));
    }
}
