package com.controllerface.cmdr_j.classes.recipes.weapons.highcapacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_HighCapacity_1 extends AbstractModificationRecipe
{
    public Weapon_HighCapacity_1()
    {
        super(Weapon_HighCapacity_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoMaximum, 36d),
                                new ItemEffectData(ItemEffect.AmmoClipSize, 36d),
                                new ItemEffectData(ItemEffect.Mass, 20d),
                                new ItemEffectData(ItemEffect.PowerDraw, 4d),
                                new ItemEffectData(ItemEffect.RateOfFire, 2d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
