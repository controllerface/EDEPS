package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.data.ModifierData;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;

import java.util.*;

public class ShipModuleData
{
    public final ShipModule module;
    public final ModificationBlueprint modificationBlueprint;
    public final ExperimentalRecipe experimentalEffectRecipe;
    public final List<ModifierData> modifiers;
    public final Integer ammoInClip;
    public final Integer ammoInHopper;
    public final Boolean powered;
    public final Integer priority;
    public final Double integrity;
    public final Integer level;
    public final Double quality;

    private ShipModuleData(Builder builder)
    {
        this.module = builder.module;
        this.modifiers = builder.modifiers;
        this.modificationBlueprint = builder.modificationBlueprint;
        this.experimentalEffectRecipe = builder.experimentalEffectRecipe;
        this.ammoInClip = builder.ammoInClip;
        this.ammoInHopper = builder.ammoInHopper;
        this.powered = builder.powered;
        this.priority = builder.priority;
        this.integrity = builder.integrity;
        this.level = builder.level;
        this.quality = builder.quality;
    }

    public Map<String, Object> toJson()
    {
        var map = new HashMap<String, Object>();

        map.put("name", module.displayText());
        map.put("powered", powered);
        map.put("priority", priority);
        map.put("integrity", integrity);

        Optional.ofNullable(level)
            .ifPresent(modLevel -> map.put("modLevel", modLevel));

        Optional.ofNullable(quality)
            .ifPresent(modQuality -> map.put("modQuality", modQuality));

        Optional.ofNullable(ammoInClip)
            .ifPresent(ammo -> map.put("ammoInClip", ammo));

        Optional.ofNullable(ammoInHopper)
            .ifPresent(ammo -> map.put("ammoInHopper", ammo));

        Optional.ofNullable(modificationBlueprint)
            .ifPresent(mod -> map.put("modification", mod.toString()));

        Optional.ofNullable(experimentalEffectRecipe)
            .ifPresent(exp -> map.put("experimental", exp.getDisplayLabel()));

        return map;
    }

    public static class Builder
    {
        private final ShipModule module;
        private List<ModifierData> modifiers;
        private ModificationBlueprint modificationBlueprint;
        private ExperimentalRecipe experimentalEffectRecipe;
        private Integer ammoInClip;
        private Integer ammoInHopper;
        private Boolean powered;
        private Integer priority;
        private Double integrity;
        private Integer level;
        private Double quality;

        public Builder(ShipModule module)
        {
            this.module = module;
        }

        public Builder setModifiers(List<ModifierData> modifiers)
        {
            this.modifiers = modifiers;
            return this;
        }

        public Builder setModificationBlueprint(ModificationBlueprint modificationBlueprint)
        {
            this.modificationBlueprint = modificationBlueprint;
            return this;
        }

        public Builder setExperimentalEffectRecipe(ExperimentalRecipe experimentalEffectName)
        {
            this.experimentalEffectRecipe = experimentalEffectName;
            return this;
        }

        public Builder setAmmoInClip(Integer ammoInClip)
        {
            this.ammoInClip = ammoInClip;
            return this;
        }

        public Builder setAmmoInHopper(Integer ammoInHopper)
        {
            this.ammoInHopper = ammoInHopper;
            return this;
        }

        public Builder setPowered(Boolean powered)
        {
            this.powered = powered;
            return this;
        }

        public Builder setPriority(Integer priority)
        {
            this.priority = priority;
            return this;
        }

        public Builder setIntegrity(Double integrity)
        {
            this.integrity = integrity;
            return this;
        }

        public Builder setLevel(Integer level)
        {
            this.level = level;
            return this;
        }

        public Builder setQuality(Double quality)
        {
            this.quality = quality;
            return this;
        }

        public ShipModuleData build()
        {
            if (modifiers == null) modifiers = new ArrayList<>();
            return new ShipModuleData(this);
        }
    }
}