package com.controllerface.cmdr_j.classes.recipes.thrusters.reinforced;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Reinforced_3 extends AbstractModificationRecipe
{
    public Engine_Reinforced_3()
    {
        super(Engine_Reinforced_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 70d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 15d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -30d)
                        ),
                new CostData(Material.HEATCONDUCTIONWIRING, 1),
                new CostData(Material.SHIELDINGSENSORS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
