package com.controllerface.cmdr_j.classes.procurements.recipes.fsd.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSD_LongRange_4 extends AbstractModificationRecipe
{
    public FSD_LongRange_4()
    {
        super(FSD_LongRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -12d),
                                new ItemEffectData(ItemEffect.Mass, 25d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass, 45d),
                                new ItemEffectData(ItemEffect.PowerDraw, 12d)
                        ),
                new CostData(Material.CHEMICALDISTILLERY, 1),
                new CostData(Material.HYPERSPACETRAJECTORIES, 1),
                new CostData(Material.MANGANESE, 1));
    }
}