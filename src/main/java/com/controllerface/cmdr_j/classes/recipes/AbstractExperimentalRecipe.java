package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

public abstract class AbstractExperimentalRecipe extends AbstractRecipe
{
    private static Icon experimentalIcon = new Icon(UIFunctions.Icons.engineering, 25, 30);

    public AbstractExperimentalRecipe(String name, ItemEffects effects, CostData ... cost)
    {
        super(name, ItemGrade.Experimental, effects, cost);
    }

    @Override
    public Icon getIcon()
    {
        return experimentalIcon;
    }

    @Override
    public String getShortLabel()
    {
        return getName();
    }

    @Override
    public String getDisplayLabel()
    {
        return getShortLabel();
    }
}
