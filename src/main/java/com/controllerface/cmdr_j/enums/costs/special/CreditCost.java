package com.controllerface.cmdr_j.enums.costs.special;

import com.controllerface.cmdr_j.interfaces.tasks.TaskCost;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.List;

public enum CreditCost implements TaskCost
{
    CREDIT_COST;

    private String localizedName = "CR";

    @Override
    public String getLocalizedName() { return localizedName; }

    @Override
    public void setLocalizedName(String localizedName) { this.localizedName = localizedName; }

    @Override
    public ItemGrade getGrade() { return ItemGrade.Credits; }

    // Stubs
    @Override public List<TaskRecipe> getAssociated() { return null; }
    @Override public void associate(TaskRecipe recipe) { }
    @Override public String getLocationInformation() { return "Bank of Zaonce\nVarious Activities"; }
    @Override public void setLocationInformation(String locationInformation) { }
}
