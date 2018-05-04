package com.controllerface.edeps.data.procurements;

import com.controllerface.edeps.Immutable;
import com.controllerface.edeps.ProcurementBlueprint;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import javafx.util.Pair;

/**
 * Data storage object used in the "procurement tree" to hold the type and individual recipe of a possible item that
 * a player can craft. This object is used for both leaf and non-leaf nodes in the tree, with non-leaf nodes using a
 * supplied string as the text to display, and leaf nodes requiring the actual type and recipe values, which are used
 * to supply the display text.
 *
 * Created by Stephen on 3/31/2018.
 */
@Immutable
public class ProcTreeData
{
    private final String text;
    private final ProcurementType type;
    private final ProcurementRecipe recipe;
    private final ProcurementBlueprint blueprint;

    public ProcTreeData(String text)
    {
        this.text = text;
        this.type = null;
        this.recipe = null;
        this.blueprint = null;
    }

    public ProcTreeData(ProcurementType type, ProcurementRecipe recipe)
    {
        this.text = recipe.toString();
        this.type = type;
        this.recipe = recipe;
        this.blueprint = null;
    }

    public ProcTreeData(ProcurementType type, ProcurementBlueprint blueprint)
    {
        this.text = blueprint.toString();
        this.type = type;
        this.recipe = null;
        this.blueprint = blueprint;
    }

    public ProcurementType getType()
    {
        return type;
    }

    public ProcurementRecipe getRecipe()
    {
        return recipe;
    }

    public ProcurementBlueprint getBlueprint()
    {
        return blueprint;
    }

    @Override
    public String toString()
    {
        return text;
    }
}
