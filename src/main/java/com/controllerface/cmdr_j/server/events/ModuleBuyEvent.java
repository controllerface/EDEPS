package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.recipes.ModulePurchaseRecipe;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CosmeticSlot;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.JournalEventEX;
import com.controllerface.cmdr_j.server.ShipModuleData;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class ModuleBuyEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        int cost = ((int) event.get("BuyPrice"));
        gameState.adjustCreditBalance(-1 * cost);

        Optional.ofNullable(event.get("SellPrice"))
            .ifPresent(sellPrice ->
            {
                int sale = (int) sellPrice;
                gameState.adjustCreditBalance(sale);
            });

        var slotKey = ((String) event.get("Slot"));
        var moduleKey = ((String) event.get("BuyItem"))
            .replace("$","")
            .replace("_name;","");

        var slot = JournalEventEX.determineStatType(slotKey);
        var module = JournalEventEX.determineModuleType(moduleKey);

        if (slot instanceof CosmeticSlot)
        {
            System.out.println("Ignoring Cosmetic Slot: " + slot);
            return;
        }

        if (slot == null || module == null)
        {
            if (slot == null) System.err.println("Ignoring Slot: " + slotKey);
            if (module == null) System.err.println("Ignoring Module: " + moduleKey);
            return;
        }

        var moduleBuilder = new ShipModuleData.Builder(module)
            .setPowered(true)
            .setPriority(0)
            .setHealth(1.0)
            .setAmmoInClip(0)
            .setAmmoInHopper(0);

        gameState.setShipModule(slot, moduleBuilder.build());
        gameState.completeTask(new ModulePurchaseRecipe(module));
        gameState.emitLoadoutEvent();
        gameState.emitCurrentMass();
        gameState.emitPowerStats();
        gameState.emitOffenseStats();
        gameState.emitDefenseStats();
    }
}
