package com.controllerface.cmdr_j.data.events.items.modules;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;
import com.controllerface.cmdr_j.data.events.JournalEventTransactions;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when a currently equipped module is sold, removing it from the current ship
 *
 * Created by Stephen on 7/18/2018.
 */
public class ModuleSellHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Module Sold");
        JournalEventTransactions.emptySlotFromData(context);
    }
}