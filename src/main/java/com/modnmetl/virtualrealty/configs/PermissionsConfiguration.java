package com.modnmetl.virtualrealty.configs;

import com.modnmetl.virtualrealty.enums.permissions.RegionPermission;
import eu.okaeri.configs.OkaeriConfig;
import eu.okaeri.configs.annotation.*;

import javax.swing.plaf.synth.Region;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Header("-------------------------------------------------------------- #")
@Header("                                                               #")
@Header("                         Permissions                           #")
@Header("                                                               #")
@Header("-------------------------------------------------------------- #")
@Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
public class PermissionsConfiguration extends OkaeriConfig {

    @Comment("Available permissions ↓")
    @Comment(" - BREAK")
    @Comment(" - PLACE")
    @Comment(" - CHEST_ACCESS")
    @Comment(" - ARMOR_STAND")
    @Comment(" - ENTITY_DAMAGE")
    @Comment(" - SWITCH")
    @Comment(" - ITEM_USE")
    @Comment(" ")
    @Comment("Set permissions for players who are not members of the plot.")
    private final List<RegionPermission> defaultNonMembers = new LinkedList<>();

    public List<RegionPermission> getDefaultNonMemberPlotPerms() {
        return defaultNonMembers;
    }

    @Comment("Set permissions for players who are members of the plot.")
    private final List<RegionPermission> defaultMembers = Arrays.asList(RegionPermission.values());

    public List<RegionPermission> getDefaultMemberPerms() {
        return defaultMembers;
    }

    @Comment("Set permissions for all players to the world")
    public final List<RegionPermission> worldProtection = Arrays.asList(RegionPermission.values());

    public List<RegionPermission> getWorldProtection() {
        return worldProtection;
    }

}