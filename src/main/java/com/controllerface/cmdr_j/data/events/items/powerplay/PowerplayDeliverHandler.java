package com.controllerface.cmdr_j.data.events.items.powerplay;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.adjustCommodityTypeDown;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when delivering powerplay specific cargo items
 *
 * Created by Stephen on 7/18/2018.
 */
public class PowerplayDeliverHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "PowerPlay Item Delivered");
        adjustCommodityTypeDown(context, context.getRawData());
    }
}