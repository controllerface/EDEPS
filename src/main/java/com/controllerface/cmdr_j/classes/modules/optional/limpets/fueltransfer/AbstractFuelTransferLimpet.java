package com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractFuelTransferLimpet extends AbstractModule
{
    public AbstractFuelTransferLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Fuel Transfer Limpet Controller", ModificationType.Fuel_Transfer_Limpet, itemEffects);
    }
}
