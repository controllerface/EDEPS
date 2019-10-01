package com.controllerface.cmdr_j.ui.ship;

import com.controllerface.cmdr_j.classes.ShipModuleData;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 4/26/2018.
 */
public class SlotNameCell extends TableCell<ShipModuleData, String>
{
    @Override
    protected void updateItem(String item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }

        super.setText(item);
        setFont(UIFunctions.Style.size2Font);
        setAlignment(Pos.TOP_RIGHT);
        paddingProperty().set(new Insets(8,5,0,0));
    }
}
