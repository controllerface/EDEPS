package com.controllerface.cmdr_j.enums.craftable.modifications;

import com.controllerface.cmdr_j.classes.procurements.ProcurementBlueprint;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Implementation Note:
 *
 * The enum values in this class must match a defined Blueprint name in the game
 *
 * Created by Controllerface on 3/31/2018.
 */
public enum ModificationBlueprint implements ProcurementBlueprint
{
    Armour_Advanced("Lightweight",
            ModificationRecipe.Armour_Advanced_1,
            ModificationRecipe.Armour_Advanced_2,
            ModificationRecipe.Armour_Advanced_3,
            ModificationRecipe.Armour_Advanced_4,
            ModificationRecipe.Armour_Advanced_5),

    Armour_Explosive("Blast Resistant",
            ModificationRecipe.Armour_Explosive_1,
            ModificationRecipe.Armour_Explosive_2,
            ModificationRecipe.Armour_Explosive_3,
            ModificationRecipe.Armour_Explosive_4,
            ModificationRecipe.Armour_Explosive_5),

    Armour_HeavyDuty("Heavy Duty",
            ModificationRecipe.Armour_HeavyDuty_1,
            ModificationRecipe.Armour_HeavyDuty_2,
            ModificationRecipe.Armour_HeavyDuty_3,
            ModificationRecipe.Armour_HeavyDuty_4,
            ModificationRecipe.Armour_HeavyDuty_5),

    Armour_Kinetic("Kinetic Resistant",
            ModificationRecipe.Armour_Kinetic_1,
            ModificationRecipe.Armour_Kinetic_2,
            ModificationRecipe.Armour_Kinetic_3,
            ModificationRecipe.Armour_Kinetic_4,
            ModificationRecipe.Armour_Kinetic_5),

    Armour_Thermic("Thermal Resistant",
            ModificationRecipe.Armour_Thermic_1,
            ModificationRecipe.Armour_Thermic_2,
            ModificationRecipe.Armour_Thermic_3,
            ModificationRecipe.Armour_Thermic_4,
            ModificationRecipe.Armour_Thermic_5),

    ChaffLauncher_ChaffCapacity("Ammo Capacity",
            ModificationRecipe.ChaffLauncher_ChaffCapacity_1),

    Engine_Dirty("Dirty",
            ModificationRecipe.Engine_Dirty_1,
            ModificationRecipe.Engine_Dirty_2,
            ModificationRecipe.Engine_Dirty_3,
            ModificationRecipe.Engine_Dirty_4,
            ModificationRecipe.Engine_Dirty_5),

    Engine_Reinforced("Reinforced",
            ModificationRecipe.Engine_Reinforced_1,
            ModificationRecipe.Engine_Reinforced_2,
            ModificationRecipe.Engine_Reinforced_3,
            ModificationRecipe.Engine_Reinforced_4,
            ModificationRecipe.Engine_Reinforced_5),

    Engine_Tuned("Clean",
            ModificationRecipe.Engine_Tuned_1,
            ModificationRecipe.Engine_Tuned_2,
            ModificationRecipe.Engine_Tuned_3,
            ModificationRecipe.Engine_Tuned_4,
            ModificationRecipe.Engine_Tuned_5),

    FSD_FastBoot("Faster Boot Sequence",
            ModificationRecipe.FSD_FastBoot_1,
            ModificationRecipe.FSD_FastBoot_2,
            ModificationRecipe.FSD_FastBoot_3,
            ModificationRecipe.FSD_FastBoot_4,
            ModificationRecipe.FSD_FastBoot_5),

    FSD_LongRange("Increased Range",
            ModificationRecipe.FSD_LongRange_1,
            ModificationRecipe.FSD_LongRange_2,
            ModificationRecipe.FSD_LongRange_3,
            ModificationRecipe.FSD_LongRange_4,
            ModificationRecipe.FSD_LongRange_5),

    FSD_Shielded("Shielded",
            ModificationRecipe.FSD_Shielded_1,
            ModificationRecipe.FSD_Shielded_2,
            ModificationRecipe.FSD_Shielded_3,
            ModificationRecipe.FSD_Shielded_4,
            ModificationRecipe.FSD_Shielded_5),

    FSDinterdictor_Expanded("Expanded Capture Arc",
            ModificationRecipe.FSDinterdictor_Expanded_1,
            ModificationRecipe.FSDinterdictor_Expanded_2,
            ModificationRecipe.FSDinterdictor_Expanded_3,
            ModificationRecipe.FSDinterdictor_Expanded_4),

    FSDinterdictor_LongRange("Long Range",
            ModificationRecipe.FSDinterdictor_LongRange_1,
            ModificationRecipe.FSDinterdictor_LongRange_2,
            ModificationRecipe.FSDinterdictor_LongRange_3,
            ModificationRecipe.FSDinterdictor_LongRange_4),

    HeatSinkLauncher_HeatSinkCapacity("Ammo Capacity",
            ModificationRecipe.HeatSinkLauncher_HeatSinkCapacity_1),

    HullReinforcement_Advanced("Lightweight",
            ModificationRecipe.HullReinforcement_Advanced_1,
            ModificationRecipe.HullReinforcement_Advanced_2,
            ModificationRecipe.HullReinforcement_Advanced_3,
            ModificationRecipe.HullReinforcement_Advanced_4,
            ModificationRecipe.HullReinforcement_Advanced_5),

    HullReinforcement_Explosive("Blast Resistant",
            ModificationRecipe.HullReinforcement_Explosive_1,
            ModificationRecipe.HullReinforcement_Explosive_2,
            ModificationRecipe.HullReinforcement_Explosive_3,
            ModificationRecipe.HullReinforcement_Explosive_4,
            ModificationRecipe.HullReinforcement_Explosive_5),

    HullReinforcement_HeavyDuty("Heavy Duty",
            ModificationRecipe.HullReinforcement_HeavyDuty_1,
            ModificationRecipe.HullReinforcement_HeavyDuty_2,
            ModificationRecipe.HullReinforcement_HeavyDuty_3,
            ModificationRecipe.HullReinforcement_HeavyDuty_4,
            ModificationRecipe.HullReinforcement_HeavyDuty_5),

    HullReinforcement_Kinetic("Kinetic Resistant",
            ModificationRecipe.HullReinforcement_Kinetic_1,
            ModificationRecipe.HullReinforcement_Kinetic_2,
            ModificationRecipe.HullReinforcement_Kinetic_3,
            ModificationRecipe.HullReinforcement_Kinetic_4,
            ModificationRecipe.HullReinforcement_Kinetic_5),

    HullReinforcement_Thermic("Thermal Resistant",
            ModificationRecipe.HullReinforcement_Thermic_1,
            ModificationRecipe.HullReinforcement_Thermic_2,
            ModificationRecipe.HullReinforcement_Thermic_3,
            ModificationRecipe.HullReinforcement_Thermic_4,
            ModificationRecipe.HullReinforcement_Thermic_5),

    KillWarrantScanner_LongRange("Long Range",
            ModificationRecipe.Sensor_Misc_LongRange_1,
            ModificationRecipe.Sensor_Misc_LongRange_2,
            ModificationRecipe.Sensor_Misc_LongRange_3,
            ModificationRecipe.Sensor_Misc_LongRange_4,
            ModificationRecipe.Sensor_Misc_LongRange_5),

    Misc_PointDefenseCapacity("Ammo Capacity",
            ModificationRecipe.PointDefence_PointDefenseCapacity_1),

    PowerDistributor_HighCapacity("High Charge Capacity",
            ModificationRecipe.PowerDistributor_HighCapacity_1,
            ModificationRecipe.PowerDistributor_HighCapacity_2,
            ModificationRecipe.PowerDistributor_HighCapacity_3,
            ModificationRecipe.PowerDistributor_HighCapacity_4,
            ModificationRecipe.PowerDistributor_HighCapacity_5),

    PowerDistributor_HighFrequency("Charge Enhanced",
            ModificationRecipe.PowerDistributor_HighFrequency_1,
            ModificationRecipe.PowerDistributor_HighFrequency_2,
            ModificationRecipe.PowerDistributor_HighFrequency_3,
            ModificationRecipe.PowerDistributor_HighFrequency_4,
            ModificationRecipe.PowerDistributor_HighFrequency_5),

    PowerDistributor_PriorityEngines("Engine Focused",
            ModificationRecipe.PowerDistributor_PriorityEngines_1,
            ModificationRecipe.PowerDistributor_PriorityEngines_2,
            ModificationRecipe.PowerDistributor_PriorityEngines_3,
            ModificationRecipe.PowerDistributor_PriorityEngines_4,
            ModificationRecipe.PowerDistributor_PriorityEngines_5),

    PowerDistributor_PrioritySystems("System Focused",
            ModificationRecipe.PowerDistributor_PrioritySystems_1,
            ModificationRecipe.PowerDistributor_PrioritySystems_2,
            ModificationRecipe.PowerDistributor_PrioritySystems_3,
            ModificationRecipe.PowerDistributor_PrioritySystems_4,
            ModificationRecipe.PowerDistributor_PrioritySystems_5),

    PowerDistributor_PriorityWeapons("Weapon Focused",
            ModificationRecipe.PowerDistributor_PriorityWeapons_1,
            ModificationRecipe.PowerDistributor_PriorityWeapons_2,
            ModificationRecipe.PowerDistributor_PriorityWeapons_3,
            ModificationRecipe.PowerDistributor_PriorityWeapons_4,
            ModificationRecipe.PowerDistributor_PriorityWeapons_5),

    PowerDistributor_Shielded("Shielded",
            ModificationRecipe.PowerDistributor_Shielded_1,
            ModificationRecipe.PowerDistributor_Shielded_2,
            ModificationRecipe.PowerDistributor_Shielded_3,
            ModificationRecipe.PowerDistributor_Shielded_4,
            ModificationRecipe.PowerDistributor_Shielded_5),

    PowerPlant_Armoured("Armoured",
            ModificationRecipe.PowerPlant_Armoured_1,
            ModificationRecipe.PowerPlant_Armoured_2,
            ModificationRecipe.PowerPlant_Armoured_3,
            ModificationRecipe.PowerPlant_Armoured_4,
            ModificationRecipe.PowerPlant_Armoured_5),

    PowerPlant_Boosted("Overcharged",
            ModificationRecipe.PowerPlant_Boosted_1,
            ModificationRecipe.PowerPlant_Boosted_2,
            ModificationRecipe.PowerPlant_Boosted_3,
            ModificationRecipe.PowerPlant_Boosted_4,
            ModificationRecipe.PowerPlant_Boosted_5),

    PowerPlant_Stealth("Low Emissions",
            ModificationRecipe.PowerPlant_Stealth_1,
            ModificationRecipe.PowerPlant_Stealth_2,
            ModificationRecipe.PowerPlant_Stealth_3,
            ModificationRecipe.PowerPlant_Stealth_4,
            ModificationRecipe.PowerPlant_Stealth_5),

    Sensor_CargoScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_Misc_FastScan_1,
            ModificationRecipe.Sensor_Misc_FastScan_2,
            ModificationRecipe.Sensor_Misc_FastScan_3,
            ModificationRecipe.Sensor_Misc_FastScan_4,
            ModificationRecipe.Sensor_Misc_FastScan_5),

    Sensor_CargoScanner_LongRange("Long Range",
            ModificationRecipe.Sensor_Misc_LongRange_1,
            ModificationRecipe.Sensor_Misc_LongRange_2,
            ModificationRecipe.Sensor_Misc_LongRange_3,
            ModificationRecipe.Sensor_Misc_LongRange_4,
            ModificationRecipe.Sensor_Misc_LongRange_5),

    Sensor_CargoScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_Misc_WideAngle_1,
            ModificationRecipe.Sensor_Misc_WideAngle_2,
            ModificationRecipe.Sensor_Misc_WideAngle_3,
            ModificationRecipe.Sensor_Misc_WideAngle_4,
            ModificationRecipe.Sensor_Misc_WideAngle_5),

    Sensor_KillWarrantScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_Misc_FastScan_1,
            ModificationRecipe.Sensor_Misc_FastScan_2,
            ModificationRecipe.Sensor_Misc_FastScan_3,
            ModificationRecipe.Sensor_Misc_FastScan_4,
            ModificationRecipe.Sensor_Misc_FastScan_5),

    Sensor_KillWarrantScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_Misc_WideAngle_1,
            ModificationRecipe.Sensor_Misc_WideAngle_2,
            ModificationRecipe.Sensor_Misc_WideAngle_3,
            ModificationRecipe.Sensor_Misc_WideAngle_4,
            ModificationRecipe.Sensor_Misc_WideAngle_5),

    Sensor_Sensor_LightWeight("Lightweight",
            ModificationRecipe.Sensor_LightWeight_1,
            ModificationRecipe.Sensor_LightWeight_2,
            ModificationRecipe.Sensor_LightWeight_3,
            ModificationRecipe.Sensor_LightWeight_4,
            ModificationRecipe.Sensor_LightWeight_5),

    Sensor_Sensor_LongRange("Long Range",
            ModificationRecipe.Sensor_LongRange_1,
            ModificationRecipe.Sensor_LongRange_2,
            ModificationRecipe.Sensor_LongRange_3,
            ModificationRecipe.Sensor_LongRange_4,
            ModificationRecipe.Sensor_LongRange_5),

    Sensor_Sensor_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_WideAngle_1,
            ModificationRecipe.Sensor_WideAngle_2,
            ModificationRecipe.Sensor_WideAngle_3,
            ModificationRecipe.Sensor_WideAngle_4,
            ModificationRecipe.Sensor_WideAngle_5),

    Sensor_Expanded("Expanded Probe Radius",
            ModificationRecipe.Sensor_Expanded_1,
            ModificationRecipe.Sensor_Expanded_2,
            ModificationRecipe.Sensor_Expanded_3,
            ModificationRecipe.Sensor_Expanded_4,
            ModificationRecipe.Sensor_Expanded_5),

    Sensor_WakeScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_Misc_FastScan_1,
            ModificationRecipe.Sensor_Misc_FastScan_2,
            ModificationRecipe.Sensor_Misc_FastScan_3,
            ModificationRecipe.Sensor_Misc_FastScan_4,
            ModificationRecipe.Sensor_Misc_FastScan_5),

    Sensor_WakeScanner_LongRange("Long Range",
            ModificationRecipe.Sensor_Misc_LongRange_1,
            ModificationRecipe.Sensor_Misc_LongRange_2,
            ModificationRecipe.Sensor_Misc_LongRange_3,
            ModificationRecipe.Sensor_Misc_LongRange_4,
            ModificationRecipe.Sensor_Misc_LongRange_5),

    Sensor_WakeScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_Misc_WideAngle_1,
            ModificationRecipe.Sensor_Misc_WideAngle_2,
            ModificationRecipe.Sensor_Misc_WideAngle_3,
            ModificationRecipe.Sensor_Misc_WideAngle_4,
            ModificationRecipe.Sensor_Misc_WideAngle_5),

    ShieldBooster_Explosive("Blast Resistant",
            ModificationRecipe.ShieldBooster_Explosive_1,
            ModificationRecipe.ShieldBooster_Explosive_2,
            ModificationRecipe.ShieldBooster_Explosive_3,
            ModificationRecipe.ShieldBooster_Explosive_4,
            ModificationRecipe.ShieldBooster_Explosive_5),

    ShieldBooster_HeavyDuty("Heavy Duty",
            ModificationRecipe.ShieldBooster_HeavyDuty_1,
            ModificationRecipe.ShieldBooster_HeavyDuty_2,
            ModificationRecipe.ShieldBooster_HeavyDuty_3,
            ModificationRecipe.ShieldBooster_HeavyDuty_4,
            ModificationRecipe.ShieldBooster_HeavyDuty_5),

    ShieldBooster_Kinetic("Kinetic Resistant",
            ModificationRecipe.ShieldBooster_Kinetic_1,
            ModificationRecipe.ShieldBooster_Kinetic_2,
            ModificationRecipe.ShieldBooster_Kinetic_3,
            ModificationRecipe.ShieldBooster_Kinetic_4,
            ModificationRecipe.ShieldBooster_Kinetic_5),

    ShieldBooster_Resistive("Resistance Augmented",
            ModificationRecipe.ShieldBooster_Resistive_1,
            ModificationRecipe.ShieldBooster_Resistive_2,
            ModificationRecipe.ShieldBooster_Resistive_3,
            ModificationRecipe.ShieldBooster_Resistive_4,
            ModificationRecipe.ShieldBooster_Resistive_5),

    ShieldBooster_Thermic("Thermal Resistant",
            ModificationRecipe.ShieldBooster_Thermic_1,
            ModificationRecipe.ShieldBooster_Thermic_2,
            ModificationRecipe.ShieldBooster_Thermic_3,
            ModificationRecipe.ShieldBooster_Thermic_4,
            ModificationRecipe.ShieldBooster_Thermic_5),

    ShieldCellBank_Rapid("Rapid Charge",
            ModificationRecipe.ShieldCellBank_Rapid_1,
            ModificationRecipe.ShieldCellBank_Rapid_2,
            ModificationRecipe.ShieldCellBank_Rapid_3),

    ShieldCellBank_Specialised("Specialised",
            ModificationRecipe.ShieldCellBank_Specialised_1,
            ModificationRecipe.ShieldCellBank_Specialised_2,
            ModificationRecipe.ShieldCellBank_Specialised_3),

    ShieldGenerator_Kinetic("Kinetic Resistant",
            ModificationRecipe.ShieldGenerator_Kinetic_1,
            ModificationRecipe.ShieldGenerator_Kinetic_2,
            ModificationRecipe.ShieldGenerator_Kinetic_3,
            ModificationRecipe.ShieldGenerator_Kinetic_4,
            ModificationRecipe.ShieldGenerator_Kinetic_5),

    ShieldGenerator_Optimised("Enhanced Low Power",
            ModificationRecipe.ShieldGenerator_Optimised_1,
            ModificationRecipe.ShieldGenerator_Optimised_2,
            ModificationRecipe.ShieldGenerator_Optimised_3,
            ModificationRecipe.ShieldGenerator_Optimised_4,
            ModificationRecipe.ShieldGenerator_Optimised_5),

    ShieldGenerator_Reinforced("Reinforced",
            ModificationRecipe.ShieldGenerator_Reinforced_1,
            ModificationRecipe.ShieldGenerator_Reinforced_2,
            ModificationRecipe.ShieldGenerator_Reinforced_3,
            ModificationRecipe.ShieldGenerator_Reinforced_4,
            ModificationRecipe.ShieldGenerator_Reinforced_5),

    ShieldGenerator_Thermic("Thermal Resistant",
            ModificationRecipe.ShieldGenerator_Thermic_1,
            ModificationRecipe.ShieldGenerator_Thermic_2,
            ModificationRecipe.ShieldGenerator_Thermic_3,
            ModificationRecipe.ShieldGenerator_Thermic_4,
            ModificationRecipe.ShieldGenerator_Thermic_5),

    Misc_LightWeight("Lightweight",
            ModificationRecipe.Misc_LightWeight_1,
            ModificationRecipe.Misc_LightWeight_2,
            ModificationRecipe.Misc_LightWeight_3,
            ModificationRecipe.Misc_LightWeight_4,
            ModificationRecipe.Misc_LightWeight_5),

    Misc_Reinforced("Reinforced",
            ModificationRecipe.Misc_Reinforced_1,
            ModificationRecipe.Misc_Reinforced_2,
            ModificationRecipe.Misc_Reinforced_3,
            ModificationRecipe.Misc_Reinforced_4,
            ModificationRecipe.Misc_Reinforced_5),

    Misc_Shielded("Shielded",
            ModificationRecipe.Misc_Shielded_1,
            ModificationRecipe.Misc_Shielded_2,
            ModificationRecipe.Misc_Shielded_3,
            ModificationRecipe.Misc_Shielded_4,
            ModificationRecipe.Misc_Shielded_5),

    Weapon_DoubleShot("Double Shot",
            WeaponModificationRecipe.Weapon_DoubleShot_1,
            WeaponModificationRecipe.Weapon_DoubleShot_2,
            WeaponModificationRecipe.Weapon_DoubleShot_3,
            WeaponModificationRecipe.Weapon_DoubleShot_4,
            WeaponModificationRecipe.Weapon_DoubleShot_5),

    Weapon_Efficient("Efficient",
            WeaponModificationRecipe.Weapon_Efficient_1,
            WeaponModificationRecipe.Weapon_Efficient_2,
            WeaponModificationRecipe.Weapon_Efficient_3,
            WeaponModificationRecipe.Weapon_Efficient_4,
            WeaponModificationRecipe.Weapon_Efficient_5),

    Weapon_Focused("Focused",
            WeaponModificationRecipe.Weapon_Focused_1,
            WeaponModificationRecipe.Weapon_Focused_2,
            WeaponModificationRecipe.Weapon_Focused_3,
            WeaponModificationRecipe.Weapon_Focused_4,
            WeaponModificationRecipe.Weapon_Focused_5),

    Weapon_HighCapacity("High Capacity",
            WeaponModificationRecipe.Weapon_HighCapacity_1,
            WeaponModificationRecipe.Weapon_HighCapacity_2,
            WeaponModificationRecipe.Weapon_HighCapacity_3,
            WeaponModificationRecipe.Weapon_HighCapacity_4,
            WeaponModificationRecipe.Weapon_HighCapacity_5),

    Weapon_LightWeight("Lightweight",
            WeaponModificationRecipe.Weapon_LightWeight_1,
            WeaponModificationRecipe.Weapon_LightWeight_2,
            WeaponModificationRecipe.Weapon_LightWeight_3,
            WeaponModificationRecipe.Weapon_LightWeight_4,
            WeaponModificationRecipe.Weapon_LightWeight_5),

    Weapon_LongRange("Long Range",
            WeaponModificationRecipe.Weapon_LongRange_1,
            WeaponModificationRecipe.Weapon_LongRange_2,
            WeaponModificationRecipe.Weapon_LongRange_3,
            WeaponModificationRecipe.Weapon_LongRange_4,
            WeaponModificationRecipe.Weapon_LongRange_5),

    Weapon_Overcharged("Overcharged",
            WeaponModificationRecipe.Weapon_Overcharged_1,
            WeaponModificationRecipe.Weapon_Overcharged_2,
            WeaponModificationRecipe.Weapon_Overcharged_3,
            WeaponModificationRecipe.Weapon_Overcharged_4,
            WeaponModificationRecipe.Weapon_Overcharged_5),

    Weapon_RapidFire("Rapid Fire",
            WeaponModificationRecipe.Weapon_RapidFire_1,
            WeaponModificationRecipe.Weapon_RapidFire_2,
            WeaponModificationRecipe.Weapon_RapidFire_3,
            WeaponModificationRecipe.Weapon_RapidFire_4,
            WeaponModificationRecipe.Weapon_RapidFire_5),

    Weapon_ShortRange("Short Range",
            WeaponModificationRecipe.Weapon_ShortRange_1,
            WeaponModificationRecipe.Weapon_ShortRange_2,
            WeaponModificationRecipe.Weapon_ShortRange_3,
            WeaponModificationRecipe.Weapon_ShortRange_4,
            WeaponModificationRecipe.Weapon_ShortRange_5),

    Weapon_Sturdy("Sturdy",
            WeaponModificationRecipe.Weapon_Sturdy_1,
            WeaponModificationRecipe.Weapon_Sturdy_2,
            WeaponModificationRecipe.Weapon_Sturdy_3,
            WeaponModificationRecipe.Weapon_Sturdy_4,
            WeaponModificationRecipe.Weapon_Sturdy_5),

    Unknown("Unknown")

    ;

    private final ProcurementRecipe[] recipes;
    private final String text;

    ModificationBlueprint(String text, ProcurementRecipe... recipes)
    {
        this.text = text;
        this.recipes = recipes;
        recipeStream().forEach(recipe -> recipe.setParentBlueprintName(text));
    }

    public Stream<ProcurementRecipe> recipeStream()
    {
        return Arrays.stream(recipes);
    }

    @Override
    public String toString()
    {
        return text;
    }
}
