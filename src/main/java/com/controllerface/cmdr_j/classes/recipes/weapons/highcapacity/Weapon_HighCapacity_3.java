package com.controllerface.cmdr_j.classes.recipes.weapons.highcapacity;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_HighCapacity_3 extends AbstractModificationRecipe
{
    public Weapon_HighCapacity_3()
    {
        super(Weapon_HighCapacity_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoMaximum_Percent, 68d),
                                new ItemEffectData(ItemEffect.AmmoClipSize_Percent, 68d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 40d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 12d),
                                new ItemEffectData(ItemEffect.RateOfFire_Percent, 6d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
