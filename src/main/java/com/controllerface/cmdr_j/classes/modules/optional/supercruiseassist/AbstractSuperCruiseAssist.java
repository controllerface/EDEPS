package com.controllerface.cmdr_j.classes.modules.optional.supercruiseassist;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractSuperCruiseAssist extends AbstractModule
{
    public AbstractSuperCruiseAssist(String displayText, ItemEffects itemEffects)
    {
        super("Supercruise Assist", itemEffects);
    }
}
