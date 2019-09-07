package com.controllerface.cmdr_j.classes.recipes.weapons.sturdy;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Sturdy_4 extends AbstractModificationRecipe
{
    public Weapon_Sturdy_4()
    {
        super(Weapon_Sturdy_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 250d),
                                new ItemEffectData(ItemEffect.Mass, 80d),
                                new ItemEffectData(ItemEffect.ArmourPenetration, 50d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -25d)
                        ),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.TUNGSTEN, 1),
                new CostData(Material.ZINC, 1));
    }
}
