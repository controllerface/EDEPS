package com.controllerface.edeps.structures.costs.materials;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * An enumeration of all the crafting material types in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum MaterialType
{
    RAW(MaterialCategory.Raw_Elements_1,
            MaterialCategory.Raw_Elements_2,
            MaterialCategory.Raw_Elements_3,
            MaterialCategory.Raw_Elements_4,
            MaterialCategory.Raw_Elements_5,
            MaterialCategory.Raw_Elements_6,
            MaterialCategory.Raw_Elements_7),

    MANUFACTURED(MaterialCategory.Chemical,
            MaterialCategory.Thermic,
            MaterialCategory.Heat,
            MaterialCategory.Conductive,
            MaterialCategory.Mechanical_Components,
            MaterialCategory.Capacitors,
            MaterialCategory.Shielding,
            MaterialCategory.Composite,
            MaterialCategory.Crystals,
            MaterialCategory.Alloys,
            MaterialCategory.Thargoid_Technology,
            MaterialCategory.Guardian_Technology),

    ENCODED(MaterialCategory.Emission_Data,
            MaterialCategory.Wake_Scans,
            MaterialCategory.Shield_Data,
            MaterialCategory.Encryption_Files,
            MaterialCategory.Data_Archives,
            MaterialCategory.Encoded_Firmware,
            MaterialCategory.Thargoid_Data,
            MaterialCategory.Guardian_Blueprint_Data,
            MaterialCategory.Guardian_Obelisk_Data),

    UNKNOWN();

    private final MaterialCategory[] categories;

    MaterialType(MaterialCategory ... categories)
    {
        this.categories = categories;
    }

    public Stream<MaterialCategory> categories()
    {
        return Arrays.stream(categories);
    }

    public static MaterialType findMatchingType(Material material)
    {
        return Arrays.stream(values())
                .filter(type -> type.categories()
                        .anyMatch(category -> category.hasMaterial(material)))
                .findFirst().orElse(UNKNOWN);
    }

    public boolean hasMaterial(Material material)
    {
        return categories()
                .anyMatch(category -> category.hasMaterial(material));
    }
}