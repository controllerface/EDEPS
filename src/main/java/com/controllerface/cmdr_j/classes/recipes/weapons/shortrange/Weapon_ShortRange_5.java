package com.controllerface.cmdr_j.classes.recipes.weapons.shortrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_ShortRange_5 extends AbstractModificationRecipe
{
    public Weapon_ShortRange_5()
    {
        super(Weapon_ShortRange_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage_Percent, 75d),
                                new ItemEffectData(ItemEffect.Range_Percent, -50d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 40d)
                        ),
                new CostData(Material.BIOTECHCONDUCTORS, 1),
                new CostData(Material.CONFIGURABLECOMPONENTS, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1));
    }
}
