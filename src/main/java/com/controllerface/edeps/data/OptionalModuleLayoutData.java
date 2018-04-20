package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.equipment.modules.ModuleSize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stephen on 4/16/2018.
 */
public class OptionalModuleLayoutData
{
    private final ModuleSize[] slots;

    private OptionalModuleLayoutData(Builder builder)
    {
        ModuleSize[] h = new ModuleSize[builder.slots.size()];
        this.slots = builder.slots.toArray(h);
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private List<ModuleSize> slots = new ArrayList<>();

        public Builder addModule(ModuleSize size)
        {
            slots.add(size);
            return this;
        }

        public OptionalModuleLayoutData build()
        {
            return new OptionalModuleLayoutData(this);
        }
    }
}