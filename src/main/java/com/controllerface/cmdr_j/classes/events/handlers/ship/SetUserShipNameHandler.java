package com.controllerface.cmdr_j.classes.events.handlers.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logLoadoutMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class SetUserShipNameHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logLoadoutMessage(context, "Reloading Ship Name");
        String shipName = ((String) context.getRawData().get("UserShipName"));
        String shipID = ((String) context.getRawData().get("UserShipId"));
        context.getCommander().getShip().setGivenName(shipName);
        context.getCommander().getShip().setShipID(shipID);
    }
}
