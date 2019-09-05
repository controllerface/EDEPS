package com.controllerface.cmdr_j.classes.procurements.recipes.fsd.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSD_LongRange_1 extends AbstractModificationRecipe
{
    public FSD_LongRange_1()
    {
        super(FSD_LongRange_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -3d),
                                new ItemEffectData(ItemEffect.Mass, 10d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass, 15d),
                                new ItemEffectData(ItemEffect.PowerDraw, 3d)
                        ),
                new CostData(Material.DISRUPTEDWAKEECHOES, 1));
    }
}