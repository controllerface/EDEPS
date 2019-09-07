package com.controllerface.cmdr_j.classes.recipes.weapons.highcapacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_HighCapacity_5 extends AbstractModificationRecipe
{
    public Weapon_HighCapacity_5()
    {
        super(Weapon_HighCapacity_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoMaximum, 100d),
                                new ItemEffectData(ItemEffect.AmmoClipSize, 100d),
                                new ItemEffectData(ItemEffect.Mass, 60d),
                                new ItemEffectData(ItemEffect.PowerDraw, 20d),
                                new ItemEffectData(ItemEffect.RateOfFire, 10d)
                        ),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.MILITARYSUPERCAPACITORS, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1));
    }
}
