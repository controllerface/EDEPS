package com.controllerface.cmdr_j.classes.recipes.weapons.shortrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_ShortRange_4 extends AbstractModificationRecipe
{
    public Weapon_ShortRange_4()
    {
        super(Weapon_ShortRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage_Percent, 63d),
                                new ItemEffectData(ItemEffect.Range_Percent, -40d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 30d)
                        ),
                new CostData(Material.CONDUCTIVEPOLYMERS, 1),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1));
    }
}
