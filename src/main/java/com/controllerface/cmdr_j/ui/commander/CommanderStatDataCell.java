package com.controllerface.cmdr_j.ui.commander;

import com.controllerface.cmdr_j.classes.commander.Statistic;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.scene.control.TableCell;
import javafx.util.Pair;

/**
 * Created by Controllerface on 4/26/2018.
 */
public class CommanderStatDataCell extends TableCell<Pair<Statistic, String>, String>
{
    private static double baseFontSize = -1;
    private static String baseFontFamily = null;

    @Override
    protected void updateItem(String item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null)
        {
            super.setText(null);
            super.setGraphic(null);
        }
        else
        {
            super.setText(item);
            synchronized (this)
            {
                if (baseFontSize == -1 && baseFontFamily == null)
                {
                    baseFontSize = getFont().getSize();
                    baseFontSize += baseFontSize / 4;
                    baseFontFamily = getFont().getFamily();
                }
            }
            setFont(UIFunctions.Style.size2Font);
        }
    }
}
