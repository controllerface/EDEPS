package com.controllerface.cmdr_j.classes.recipes.sensors.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_LongRange_4 extends AbstractModificationRecipe
{
    public Sensor_LongRange_4()
    {
        super(Sensor_LongRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass_Percent, 80d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle_Percent, -25d),
                                new ItemEffectData(ItemEffect.Range_Percent, 60d)
                        ),
                new CostData(Material.DECODEDEMISSIONDATA, 1),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.GERMANIUM, 1));
    }
}
