package com.controllerface.cmdr_j.classes.recipes.shieldcellbank.specialized;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldCellBank_Specialized_3 extends AbstractModificationRecipe
{
    public ShieldCellBank_Specialized_3()
    {
        super(ShieldCellBank_Specialized_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime_Percent, -24d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -15d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 20d),
                                new ItemEffectData(ItemEffect.ShieldBankReinforcement_Percent, 8d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -18d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.SCRAMBLEDEMISSIONDATA, 1));
    }
}
