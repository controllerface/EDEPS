package com.controllerface.edeps.ui;

import com.controllerface.edeps.data.procurements.ProcurementTaskData;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalType;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableStringValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TreeCell;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Stephen on 4/1/2018.
 */
public class ProcTreeCell extends TreeCell<ProcurementTaskData>
{
    private final ObservableList<ProcurementTaskData> outputList;
    private final SimpleStringProperty outputLabel;
    private static final AtomicReference<Font> baseFont = new AtomicReference<>(null);

    private ProcurementTaskData thisItem = null;

    public ProcTreeCell(ObservableList<ProcurementTaskData> outputList, SimpleStringProperty outputLabel)
    {
        this.outputList = outputList;
        this.outputLabel = outputLabel;

        this.setOnMouseClicked((e)->
        {
            if (thisItem != null && thisItem.getBlueprint() != null && thisItem.getType() != null)
            {
                outputList.clear();

                String displayText;

                if (thisItem.getType() instanceof ExperimentalType)
                {
                    displayText = "Experimental Effects :: " + thisItem.getBlueprint().toString();
                }
                else displayText = thisItem.getType().toString() + " :: " + thisItem.getBlueprint().toString();

                outputLabel.set(displayText);

                thisItem.getBlueprint().recipeStream()
                        .map(recipe -> new ProcurementTaskData(thisItem.getType(), recipe))
                        .forEach(outputList::add);
            }
        });
    }

    @Override
    protected void updateItem(ProcurementTaskData item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null)
        {
            setGraphic(null);
            setText(null);
            return;
        }
        else thisItem = item;

        synchronized (baseFont)
        {
            if (baseFont.get() == null)
            {
                Font ba = getFont();
                baseFont.set(Font.font(ba.getFamily(), FontWeight.BOLD, ba.getSize() + (ba.getSize() / 3)));
            }
        }

        Text text = new Text(item.toString());
        if (this.getTreeItem().isLeaf())
        {
            text.underlineProperty().setValue(true);
        }
        text.setFont(baseFont.get());
        setGraphic(text);
        this.paddingProperty().setValue(new Insets(5,5,5,5));
    }
}
