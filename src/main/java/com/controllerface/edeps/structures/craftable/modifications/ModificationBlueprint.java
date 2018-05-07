package com.controllerface.edeps.structures.craftable.modifications;

import com.controllerface.edeps.ProcurementBlueprint;
import com.controllerface.edeps.ProcurementRecipe;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
public enum ModificationBlueprint implements ProcurementBlueprint
{
    AFM_Shielded("Shielded",
            ModificationRecipe.AFM_Shielded_1,
            ModificationRecipe.AFM_Shielded_2,
            ModificationRecipe.AFM_Shielded_3,
            ModificationRecipe.AFM_Shielded_4),

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

    CargoScanner_LightWeight("Lightweight",
            ModificationRecipe.CargoScanner_LightWeight_1,
            ModificationRecipe.CargoScanner_LightWeight_2,
            ModificationRecipe.CargoScanner_LightWeight_3,
            ModificationRecipe.CargoScanner_LightWeight_4,
            ModificationRecipe.CargoScanner_LightWeight_5),

    CargoScanner_Reinforced("Reinforced",
            ModificationRecipe.CargoScanner_Reinforced_1,
            ModificationRecipe.CargoScanner_Reinforced_2,
            ModificationRecipe.CargoScanner_Reinforced_3,
            ModificationRecipe.CargoScanner_Reinforced_4,
            ModificationRecipe.CargoScanner_Reinforced_5),

    CargoScanner_Shielded("Shielded",
            ModificationRecipe.CargoScanner_Shielded_1,
            ModificationRecipe.CargoScanner_Shielded_2,
            ModificationRecipe.CargoScanner_Shielded_3,
            ModificationRecipe.CargoScanner_Shielded_4,
            ModificationRecipe.CargoScanner_Shielded_5),

    ChaffLauncher_ChaffCapacity("AmmoMaximum Capacity",
            ModificationRecipe.ChaffLauncher_ChaffCapacity_1),

    ChaffLauncher_LightWeight("Lightweight",
            ModificationRecipe.ChaffLauncher_LightWeight_1,
            ModificationRecipe.ChaffLauncher_LightWeight_2,
            ModificationRecipe.ChaffLauncher_LightWeight_3,
            ModificationRecipe.ChaffLauncher_LightWeight_4,
            ModificationRecipe.ChaffLauncher_LightWeight_5),

    ChaffLauncher_Reinforced("Reinforced",
            ModificationRecipe.ChaffLauncher_Reinforced_1,
            ModificationRecipe.ChaffLauncher_Reinforced_2,
            ModificationRecipe.ChaffLauncher_Reinforced_3,
            ModificationRecipe.ChaffLauncher_Reinforced_4,
            ModificationRecipe.ChaffLauncher_Reinforced_5),

    ChaffLauncher_Shielded("Shielded",
            ModificationRecipe.ChaffLauncher_Shielded_1,
            ModificationRecipe.ChaffLauncher_Shielded_2,
            ModificationRecipe.ChaffLauncher_Shielded_3,
            ModificationRecipe.ChaffLauncher_Shielded_4,
            ModificationRecipe.ChaffLauncher_Shielded_5),

    CollectionLimpet_LightWeight("Lightweight",
            ModificationRecipe.CollectionLimpet_LightWeight_1,
            ModificationRecipe.CollectionLimpet_LightWeight_2,
            ModificationRecipe.CollectionLimpet_LightWeight_3,
            ModificationRecipe.CollectionLimpet_LightWeight_4,
            ModificationRecipe.CollectionLimpet_LightWeight_5),

    CollectionLimpet_Reinforced("Reinforced",
            ModificationRecipe.CollectionLimpet_Reinforced_1,
            ModificationRecipe.CollectionLimpet_Reinforced_2,
            ModificationRecipe.CollectionLimpet_Reinforced_3,
            ModificationRecipe.CollectionLimpet_Reinforced_4,
            ModificationRecipe.CollectionLimpet_Reinforced_5),

    CollectionLimpet_Shielded("Shielded",
            ModificationRecipe.CollectionLimpet_Shielded_1,
            ModificationRecipe.CollectionLimpet_Shielded_2,
            ModificationRecipe.CollectionLimpet_Shielded_3,
            ModificationRecipe.CollectionLimpet_Shielded_4,
            ModificationRecipe.CollectionLimpet_Shielded_5),

    ECM_LightWeight("Lightweight",
            ModificationRecipe.ECM_LightWeight_1,
            ModificationRecipe.ECM_LightWeight_2,
            ModificationRecipe.ECM_LightWeight_3,
            ModificationRecipe.ECM_LightWeight_4,
            ModificationRecipe.ECM_LightWeight_5),

    ECM_Reinforced("Reinforced",
            ModificationRecipe.ECM_Reinforced_1,
            ModificationRecipe.ECM_Reinforced_2,
            ModificationRecipe.ECM_Reinforced_3,
            ModificationRecipe.ECM_Reinforced_4,
            ModificationRecipe.ECM_Reinforced_5),

    ECM_Shielded("Shielded",
            ModificationRecipe.ECM_Shielded_1,
            ModificationRecipe.ECM_Shielded_2,
            ModificationRecipe.ECM_Shielded_3,
            ModificationRecipe.ECM_Shielded_4,
            ModificationRecipe.ECM_Shielded_5),

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

    FuelScoop_Shielded("Shielded",
            ModificationRecipe.FuelScoop_Shielded_1,
            ModificationRecipe.FuelScoop_Shielded_2,
            ModificationRecipe.FuelScoop_Shielded_3,
            ModificationRecipe.FuelScoop_Shielded_4),

    FuelTransferLimpet_LightWeight("Lightweight",
            ModificationRecipe.FuelTransferLimpet_LightWeight_1,
            ModificationRecipe.FuelTransferLimpet_LightWeight_2,
            ModificationRecipe.FuelTransferLimpet_LightWeight_3,
            ModificationRecipe.FuelTransferLimpet_LightWeight_4,
            ModificationRecipe.FuelTransferLimpet_LightWeight_5),

    FuelTransferLimpet_Reinforced("Reinforced",
            ModificationRecipe.FuelTransferLimpet_Reinforced_1,
            ModificationRecipe.FuelTransferLimpet_Reinforced_2,
            ModificationRecipe.FuelTransferLimpet_Reinforced_3,
            ModificationRecipe.FuelTransferLimpet_Reinforced_4,
            ModificationRecipe.FuelTransferLimpet_Reinforced_5),

    FuelTransferLimpet_Shielded("Shielded",
            ModificationRecipe.FuelTransferLimpet_Shielded_1,
            ModificationRecipe.FuelTransferLimpet_Shielded_2,
            ModificationRecipe.FuelTransferLimpet_Shielded_3,
            ModificationRecipe.FuelTransferLimpet_Shielded_4,
            ModificationRecipe.FuelTransferLimpet_Shielded_5),

    HatchBreakerLimpet_LightWeight("Lightweight",
            ModificationRecipe.HatchBreakerLimpet_LightWeight_1,
            ModificationRecipe.HatchBreakerLimpet_LightWeight_2,
            ModificationRecipe.HatchBreakerLimpet_LightWeight_3,
            ModificationRecipe.HatchBreakerLimpet_LightWeight_4,
            ModificationRecipe.HatchBreakerLimpet_LightWeight_5),

    HatchBreakerLimpet_Reinforced("Reinforced",
            ModificationRecipe.HatchBreakerLimpet_Reinforced_1,
            ModificationRecipe.HatchBreakerLimpet_Reinforced_2,
            ModificationRecipe.HatchBreakerLimpet_Reinforced_3,
            ModificationRecipe.HatchBreakerLimpet_Reinforced_4,
            ModificationRecipe.HatchBreakerLimpet_Reinforced_5),

    HatchBreakerLimpet_Shielded("Shielded",
            ModificationRecipe.HatchBreakerLimpet_Shielded_1,
            ModificationRecipe.HatchBreakerLimpet_Shielded_2,
            ModificationRecipe.HatchBreakerLimpet_Shielded_3,
            ModificationRecipe.HatchBreakerLimpet_Shielded_4,
            ModificationRecipe.HatchBreakerLimpet_Shielded_5),

    HeatSinkLauncher_HeatSinkCapacity("Ammo Capacity",
            ModificationRecipe.HeatSinkLauncher_HeatSinkCapacity_1),

    HeatSinkLauncher_LightWeight("Lightweight",
            ModificationRecipe.HeatSinkLauncher_LightWeight_1,
            ModificationRecipe.HeatSinkLauncher_LightWeight_2,
            ModificationRecipe.HeatSinkLauncher_LightWeight_3,
            ModificationRecipe.HeatSinkLauncher_LightWeight_4,
            ModificationRecipe.HeatSinkLauncher_LightWeight_5),

    HeatSinkLauncher_Reinforced("Reinforced",
            ModificationRecipe.HeatSinkLauncher_Reinforced_1,
            ModificationRecipe.HeatSinkLauncher_Reinforced_2,
            ModificationRecipe.HeatSinkLauncher_Reinforced_3,
            ModificationRecipe.HeatSinkLauncher_Reinforced_4,
            ModificationRecipe.HeatSinkLauncher_Reinforced_5),

    HeatSinkLauncher_Shielded("Shielded",
            ModificationRecipe.HeatSinkLauncher_Shielded_1,
            ModificationRecipe.HeatSinkLauncher_Shielded_2,
            ModificationRecipe.HeatSinkLauncher_Shielded_3,
            ModificationRecipe.HeatSinkLauncher_Shielded_4,
            ModificationRecipe.HeatSinkLauncher_Shielded_5),

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

    KillWarrantScanner_LightWeight("Lightweight",
            ModificationRecipe.KillWarrantScanner_LightWeight_1,
            ModificationRecipe.KillWarrantScanner_LightWeight_2,
            ModificationRecipe.KillWarrantScanner_LightWeight_3,
            ModificationRecipe.KillWarrantScanner_LightWeight_4,
            ModificationRecipe.KillWarrantScanner_LightWeight_5),

    KillWarrantScanner_LongRange("Long Range",
            ModificationRecipe.KillWarrantScanner_LongRange_1,
            ModificationRecipe.KillWarrantScanner_LongRange_2,
            ModificationRecipe.KillWarrantScanner_LongRange_3,
            ModificationRecipe.KillWarrantScanner_LongRange_4,
            ModificationRecipe.KillWarrantScanner_LongRange_5),

    KillWarrantScanner_Reinforced("Reinforced",
            ModificationRecipe.KillWarrantScanner_Reinforced_1,
            ModificationRecipe.KillWarrantScanner_Reinforced_2,
            ModificationRecipe.KillWarrantScanner_Reinforced_3,
            ModificationRecipe.KillWarrantScanner_Reinforced_4,
            ModificationRecipe.KillWarrantScanner_Reinforced_5),

    KillWarrantScanner_Shielded("Shielded",
            ModificationRecipe.KillWarrantScanner_Shielded_1,
            ModificationRecipe.KillWarrantScanner_Shielded_2,
            ModificationRecipe.KillWarrantScanner_Shielded_3,
            ModificationRecipe.KillWarrantScanner_Shielded_4,
            ModificationRecipe.KillWarrantScanner_Shielded_5),

    LifeSupport_LightWeight("Lightweight",
            ModificationRecipe.LifeSupport_LightWeight_1,
            ModificationRecipe.LifeSupport_LightWeight_2,
            ModificationRecipe.LifeSupport_LightWeight_3,
            ModificationRecipe.LifeSupport_LightWeight_4),

    LifeSupport_Reinforced("Reinforced",
            ModificationRecipe.LifeSupport_Reinforced_1,
            ModificationRecipe.LifeSupport_Reinforced_2,
            ModificationRecipe.LifeSupport_Reinforced_3,
            ModificationRecipe.LifeSupport_Reinforced_4,
            ModificationRecipe.LifeSupport_Reinforced_5),

    LifeSupport_Shielded("Shielded",
            ModificationRecipe.LifeSupport_Shielded_1,
            ModificationRecipe.LifeSupport_Shielded_2,
            ModificationRecipe.LifeSupport_Shielded_3,
            ModificationRecipe.LifeSupport_Shielded_4),

    PointDefence_LightWeight("Lightweight",
            ModificationRecipe.PointDefence_LightWeight_1,
            ModificationRecipe.PointDefence_LightWeight_2,
            ModificationRecipe.PointDefence_LightWeight_3,
            ModificationRecipe.PointDefence_LightWeight_4,
            ModificationRecipe.PointDefence_LightWeight_5),

    PointDefence_PointDefenseCapacity("Ammo Capacity",
            ModificationRecipe.PointDefence_PointDefenseCapacity_1),

    PointDefence_Reinforced("Reinforced",
            ModificationRecipe.PointDefence_Reinforced_1,
            ModificationRecipe.PointDefence_Reinforced_2,
            ModificationRecipe.PointDefence_Reinforced_3,
            ModificationRecipe.PointDefence_Reinforced_4,
            ModificationRecipe.PointDefence_Reinforced_5),

    PointDefence_Shielded("Shielded",
            ModificationRecipe.PointDefence_Shielded_1,
            ModificationRecipe.PointDefence_Shielded_2,
            ModificationRecipe.PointDefence_Shielded_3,
            ModificationRecipe.PointDefence_Shielded_4,
            ModificationRecipe.PointDefence_Shielded_5),

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

    ProspectingLimpet_LightWeight("Lightweight",
            ModificationRecipe.ProspectingLimpet_LightWeight_1,
            ModificationRecipe.ProspectingLimpet_LightWeight_2,
            ModificationRecipe.ProspectingLimpet_LightWeight_3,
            ModificationRecipe.ProspectingLimpet_LightWeight_4,
            ModificationRecipe.ProspectingLimpet_LightWeight_5),

    ProspectingLimpet_Reinforced("Reinforced",
            ModificationRecipe.ProspectingLimpet_Reinforced_1,
            ModificationRecipe.ProspectingLimpet_Reinforced_2,
            ModificationRecipe.ProspectingLimpet_Reinforced_3,
            ModificationRecipe.ProspectingLimpet_Reinforced_4,
            ModificationRecipe.ProspectingLimpet_Reinforced_5),

    ProspectingLimpet_Shielded("Shielded",
            ModificationRecipe.ProspectingLimpet_Shielded_1,
            ModificationRecipe.ProspectingLimpet_Shielded_2,
            ModificationRecipe.ProspectingLimpet_Shielded_3,
            ModificationRecipe.ProspectingLimpet_Shielded_4,
            ModificationRecipe.ProspectingLimpet_Shielded_5),

    Refineries_Shielded("Shielded",
            ModificationRecipe.Refineries_Shielded_1,
            ModificationRecipe.Refineries_Shielded_2,
            ModificationRecipe.Refineries_Shielded_3,
            ModificationRecipe.Refineries_Shielded_4),

    Sensor_CargoScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_CargoScanner_FastScan_1,
            ModificationRecipe.Sensor_CargoScanner_FastScan_2,
            ModificationRecipe.Sensor_CargoScanner_FastScan_3,
            ModificationRecipe.Sensor_CargoScanner_FastScan_4,
            ModificationRecipe.Sensor_CargoScanner_FastScan_5),

    Sensor_CargoScanner_LongRange("Long Range",
            ModificationRecipe.Sensor_CargoScanner_LongRange_1,
            ModificationRecipe.Sensor_CargoScanner_LongRange_2,
            ModificationRecipe.Sensor_CargoScanner_LongRange_3,
            ModificationRecipe.Sensor_CargoScanner_LongRange_4,
            ModificationRecipe.Sensor_CargoScanner_LongRange_5),

    Sensor_CargoScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_CargoScanner_WideAngle_1,
            ModificationRecipe.Sensor_CargoScanner_WideAngle_2,
            ModificationRecipe.Sensor_CargoScanner_WideAngle_3,
            ModificationRecipe.Sensor_CargoScanner_WideAngle_4,
            ModificationRecipe.Sensor_CargoScanner_WideAngle_5),

    Sensor_KillWarrantScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_KillWarrantScanner_FastScan_1,
            ModificationRecipe.Sensor_KillWarrantScanner_FastScan_2,
            ModificationRecipe.Sensor_KillWarrantScanner_FastScan_3,
            ModificationRecipe.Sensor_KillWarrantScanner_FastScan_4,
            ModificationRecipe.Sensor_KillWarrantScanner_FastScan_5),

    Sensor_KillWarrantScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_KillWarrantScanner_WideAngle_1,
            ModificationRecipe.Sensor_KillWarrantScanner_WideAngle_2,
            ModificationRecipe.Sensor_KillWarrantScanner_WideAngle_3,
            ModificationRecipe.Sensor_KillWarrantScanner_WideAngle_4,
            ModificationRecipe.Sensor_KillWarrantScanner_WideAngle_5),

    Sensor_LightWeight("Lightweight",
            ModificationRecipe.Sensor_LightWeight_1,
            ModificationRecipe.Sensor_LightWeight_2,
            ModificationRecipe.Sensor_LightWeight_3,
            ModificationRecipe.Sensor_LightWeight_4,
            ModificationRecipe.Sensor_LightWeight_5),

    Sensor_LongRange("Long Range",
            ModificationRecipe.Sensor_LongRange_1,
            ModificationRecipe.Sensor_LongRange_2,
            ModificationRecipe.Sensor_LongRange_3,
            ModificationRecipe.Sensor_LongRange_4,
            ModificationRecipe.Sensor_LongRange_5),

    Sensor_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_WideAngle_1,
            ModificationRecipe.Sensor_WideAngle_2,
            ModificationRecipe.Sensor_WideAngle_3,
            ModificationRecipe.Sensor_WideAngle_4,
            ModificationRecipe.Sensor_WideAngle_5),

    Sensor_SurfaceScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_SurfaceScanner_FastScan_1,
            ModificationRecipe.Sensor_SurfaceScanner_FastScan_2,
            ModificationRecipe.Sensor_SurfaceScanner_FastScan_3,
            ModificationRecipe.Sensor_SurfaceScanner_FastScan_4,
            ModificationRecipe.Sensor_SurfaceScanner_FastScan_5),

    Sensor_SurfaceScanner_LongRange("Long Range",
            ModificationRecipe.Sensor_SurfaceScanner_LongRange_1,
            ModificationRecipe.Sensor_SurfaceScanner_LongRange_2,
            ModificationRecipe.Sensor_SurfaceScanner_LongRange_3,
            ModificationRecipe.Sensor_SurfaceScanner_LongRange_4,
            ModificationRecipe.Sensor_SurfaceScanner_LongRange_5),

    Sensor_SurfaceScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_SurfaceScanner_WideAngle_1,
            ModificationRecipe.Sensor_SurfaceScanner_WideAngle_2,
            ModificationRecipe.Sensor_SurfaceScanner_WideAngle_3,
            ModificationRecipe.Sensor_SurfaceScanner_WideAngle_4,
            ModificationRecipe.Sensor_SurfaceScanner_WideAngle_5),

    Sensor_WakeScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_WakeScanner_FastScan_1,
            ModificationRecipe.Sensor_WakeScanner_FastScan_2,
            ModificationRecipe.Sensor_WakeScanner_FastScan_3,
            ModificationRecipe.Sensor_WakeScanner_FastScan_4,
            ModificationRecipe.Sensor_WakeScanner_FastScan_5),

    Sensor_WakeScanner_LongRange("Long Range",
            ModificationRecipe.Sensor_WakeScanner_LongRange_1,
            ModificationRecipe.Sensor_WakeScanner_LongRange_2,
            ModificationRecipe.Sensor_WakeScanner_LongRange_3,
            ModificationRecipe.Sensor_WakeScanner_LongRange_4,
            ModificationRecipe.Sensor_WakeScanner_LongRange_5),

    Sensor_WakeScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_WakeScanner_WideAngle_1,
            ModificationRecipe.Sensor_WakeScanner_WideAngle_2,
            ModificationRecipe.Sensor_WakeScanner_WideAngle_3,
            ModificationRecipe.Sensor_WakeScanner_WideAngle_4,
            ModificationRecipe.Sensor_WakeScanner_WideAngle_5),

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

    WakeScanner_LightWeight("Lightweight",
            ModificationRecipe.WakeScanner_LightWeight_1,
            ModificationRecipe.WakeScanner_LightWeight_2,
            ModificationRecipe.WakeScanner_LightWeight_3,
            ModificationRecipe.WakeScanner_LightWeight_4,
            ModificationRecipe.WakeScanner_LightWeight_5),

    WakeScanner_Reinforced("Reinforced",
            ModificationRecipe.WakeScanner_Reinforced_1,
            ModificationRecipe.WakeScanner_Reinforced_2,
            ModificationRecipe.WakeScanner_Reinforced_3,
            ModificationRecipe.WakeScanner_Reinforced_4,
            ModificationRecipe.WakeScanner_Reinforced_5),

    WakeScanner_Shielded("Shielded",
            ModificationRecipe.WakeScanner_Shielded_1,
            ModificationRecipe.WakeScanner_Shielded_2,
            ModificationRecipe.WakeScanner_Shielded_3,
            ModificationRecipe.WakeScanner_Shielded_4,
            ModificationRecipe.WakeScanner_Shielded_5),

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
