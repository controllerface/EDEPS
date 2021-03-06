package com.controllerface.cmdr_j.classes.recipes.interdictor.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSDinterdictor_LongRange_1 extends AbstractModificationRecipe
{
    public FSDinterdictor_LongRange_1()
    {
        super(FSDinterdictor_LongRange_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit_Percent, -10d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 10d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 10d),
                                new ItemEffectData(ItemEffect.Range_Percent, 20d)
                        ),
                new CostData(Material.ENCRYPTEDFILES, 1));
    }
}
