package com.controllerface.cmdr_j.enums.craftable.modifications;

import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
public enum ModificationType implements TaskType
{
    // weapons
    Beam_Laser(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Burst_Laser(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_Focused,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Pulse_Laser(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_Focused,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Cannon(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Multi_Cannon(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Fragment_Cannon(EnumSet.of(ModificationBlueprint.Weapon_DoubleShot,
            ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy)),

    Missile_Rack(EnumSet.of(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy)),

    Seeker_Missile_Rack(EnumSet.of(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy)),

    Torpedo_Pylon(EnumSet.of(ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_Sturdy)),

    Mine_Launcher(EnumSet.of(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy)),

    Plasma_Accelerator(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_Focused,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Rail_Gun(EnumSet.of(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    // util
    Chaff_Launcher(EnumSet.of(ModificationBlueprint.ChaffLauncher_ChaffCapacity,
            ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded)),

    Heat_Sink_Launcher(EnumSet.of(ModificationBlueprint.HeatSinkLauncher_HeatSinkCapacity,
            ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded)),

    Point_Defense(EnumSet.of(ModificationBlueprint.Misc_PointDefenseCapacity,
            ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded)),

    Electronic_Countermeasures(EnumSet.of(ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded)),

    Frame_Shift_Wake_Scanner(EnumSet.of(ModificationBlueprint.Sensor_WakeScanner_FastScan,
            ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Sensor_WakeScanner_LongRange,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded,
            ModificationBlueprint.Sensor_WakeScanner_WideAngle)),

    Kill_Warrant_Scanner(EnumSet.of(ModificationBlueprint.Sensor_KillWarrantScanner_FastScan,
            ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.KillWarrantScanner_LongRange,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded,
            ModificationBlueprint.Sensor_KillWarrantScanner_WideAngle)),

    Manifest_Scanner(EnumSet.of(ModificationBlueprint.Sensor_CargoScanner_FastScan,
            ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Sensor_CargoScanner_LongRange,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded,
            ModificationBlueprint.Sensor_CargoScanner_WideAngle)),

    Shield_Booster(EnumSet.of(ModificationBlueprint.ShieldBooster_Explosive,
            ModificationBlueprint.ShieldBooster_HeavyDuty,
            ModificationBlueprint.ShieldBooster_Kinetic,
            ModificationBlueprint.ShieldBooster_Resistive,
            ModificationBlueprint.ShieldBooster_Thermic)),

    // optional
    Auto_Field_Maintenence_Unit(EnumSet.of(ModificationBlueprint.Misc_Shielded)),

    Hull_Reinforcement_Package(EnumSet.of(ModificationBlueprint.HullReinforcement_Explosive,
            ModificationBlueprint.HullReinforcement_Kinetic,
            ModificationBlueprint.HullReinforcement_Thermic,
            ModificationBlueprint.HullReinforcement_Advanced,
            ModificationBlueprint.HullReinforcement_HeavyDuty)),

    Detailed_Surface_Scanner(EnumSet.of(ModificationBlueprint.Sensor_Expanded)),

    Refinery(EnumSet.of(ModificationBlueprint.Misc_Shielded)),

    Frame_Shift_Drive_Interdictor(EnumSet.of(ModificationBlueprint.FSDinterdictor_Expanded,
            ModificationBlueprint.FSDinterdictor_LongRange)),

    Fuel_Scoop(EnumSet.of(ModificationBlueprint.Misc_Shielded)),

    Collector_Limpet_Controller(EnumSet.of(ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded)),

    Prospector_Limpet_Controller(EnumSet.of(ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded)),

    Fuel_Transfer_Limpet(EnumSet.of(ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded)),

    Hatch_Breaker_Limpet(EnumSet.of(ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded)),

    Shield_Cell_Bank(EnumSet.of(ModificationBlueprint.ShieldCellBank_Rapid,
            ModificationBlueprint.ShieldCellBank_Specialised)),

    Shield_Generator(EnumSet.of(ModificationBlueprint.ShieldGenerator_Optimised,
            ModificationBlueprint.ShieldGenerator_Kinetic,
            ModificationBlueprint.ShieldGenerator_Reinforced,
            ModificationBlueprint.ShieldGenerator_Thermic)),

    // core
    Frame_Shift_Drive(EnumSet.of(ModificationBlueprint.FSD_FastBoot,
            ModificationBlueprint.FSD_LongRange,
            ModificationBlueprint.FSD_Shielded)),

    Life_Support(EnumSet.of(ModificationBlueprint.Misc_LightWeight,
            ModificationBlueprint.Misc_Reinforced,
            ModificationBlueprint.Misc_Shielded)),

    Power_Distributor(EnumSet.of(ModificationBlueprint.PowerDistributor_HighFrequency,
            ModificationBlueprint.PowerDistributor_HighCapacity,
            ModificationBlueprint.PowerDistributor_Shielded,
            ModificationBlueprint.PowerDistributor_PriorityEngines,
            ModificationBlueprint.PowerDistributor_PrioritySystems,
            ModificationBlueprint.PowerDistributor_PriorityWeapons)),

    Power_Plant(EnumSet.of(ModificationBlueprint.PowerPlant_Armoured,
            ModificationBlueprint.PowerPlant_Stealth,
            ModificationBlueprint.PowerPlant_Boosted)),

    Sensors(EnumSet.of(ModificationBlueprint.Sensor_LightWeight,
            ModificationBlueprint.Sensor_LongRange,
            ModificationBlueprint.Sensor_WideAngle)),

    Thrusters(EnumSet.of(ModificationBlueprint.Engine_Tuned,
            ModificationBlueprint.Engine_Dirty,
            ModificationBlueprint.Engine_Reinforced)),

    Bulkheads(EnumSet.of(ModificationBlueprint.Armour_Advanced,
            ModificationBlueprint.Armour_HeavyDuty,
            ModificationBlueprint.Armour_Explosive,
            ModificationBlueprint.Armour_Kinetic,
            ModificationBlueprint.Armour_Thermic)),

    ;

    private final EnumSet<ModificationBlueprint> blueprints;

    ModificationType(EnumSet<ModificationBlueprint> blueprints)
    {
        this.blueprints = blueprints;
    }

    public Stream<ModificationBlueprint> blueprintStream()
    {
        return blueprints.stream();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }

    @Override
    public String getName()
    {
        return name();
    }

    @Override
    public List<TaskBlueprint> getBluePrints()
    {
        return new ArrayList<>(blueprints) ;
    }
}
