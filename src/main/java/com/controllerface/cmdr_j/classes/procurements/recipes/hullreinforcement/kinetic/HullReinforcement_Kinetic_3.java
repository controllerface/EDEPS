package com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_Kinetic_3 extends AbstractModifcationRecipe
{
    public HullReinforcement_Kinetic_3()
    {
        super(HullReinforcement_Kinetic_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -6d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 9d),
                                new ItemEffectData(ItemEffect.KineticResistance, 25.4d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -6d)
                        ),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.SALVAGEDALLOYS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
