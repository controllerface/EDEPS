package com.controllerface.cmdr_j.classes.recipes.interdictor.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSDinterdictor_LongRange_4 extends AbstractModificationRecipe
{
    public FSDinterdictor_LongRange_4()
    {
        super(FSDinterdictor_LongRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit_Percent, -25d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 25d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 40d),
                                new ItemEffectData(ItemEffect.Range_Percent, 50d)
                        ),
                new CostData(Material.SCANARCHIVES, 1),
                new CostData(Material.WAKESOLUTIONS, 1),
                new CostData(Material.ENCRYPTIONARCHIVES, 1));
    }
}
