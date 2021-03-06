package com.controllerface.cmdr_j.classes.modules.optional.fighterbay;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractFighterBay extends AbstractModule
{
    public AbstractFighterBay(String displayText, ItemEffects itemEffects)
    {
        super("Fighter Hangar", itemEffects);
    }
}
