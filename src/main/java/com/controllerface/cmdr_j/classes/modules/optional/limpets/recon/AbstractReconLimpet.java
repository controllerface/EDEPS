package com.controllerface.cmdr_j.classes.modules.optional.limpets.recon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractReconLimpet extends AbstractModule
{
    public AbstractReconLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Recon Limpet Controller", itemEffects);
    }
}
