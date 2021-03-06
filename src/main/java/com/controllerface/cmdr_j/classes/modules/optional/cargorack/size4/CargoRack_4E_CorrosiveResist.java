package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_4E_CorrosiveResist extends AbstractHumanModule
{
    public CargoRack_4E_CorrosiveResist()
    {
        super("Corrosion Resistant Cargo Rack",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1d),
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.CargoCapacity, 16d)
                ));
    }

    @Override
    public long price()
    {
        return 94_330;
    }
}
