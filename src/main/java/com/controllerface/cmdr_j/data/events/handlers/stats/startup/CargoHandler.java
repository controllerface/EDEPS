package com.controllerface.cmdr_j.data.events.handlers.stats.startup;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.adjustCommodityCount;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;


/**
 * Main cargo event: written at startup, when loading from main menu
 *
 * Created by Stephen on 7/18/2018.
 */
public class CargoHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Reloading Cargo");

        context.getCommanderData().clearCargo();

        if (context.getRawData().get("Inventory") == null) return;

        ((List<Map<String, Object>>) context.getRawData().get("Inventory")).stream()
                .forEach(item -> {
                    adjustCommodityCount(context, item);
                });
    }
}