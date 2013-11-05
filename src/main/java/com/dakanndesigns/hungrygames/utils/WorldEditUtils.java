package com.dakanndesigns.hungrygames.utils;

import com.dakanndesigns.hungrygames.enums.ChatStrings;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.bukkit.selections.Selection;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

/**
 * These are just a few WorldEdit utilities that will be used throughout our code base.
 * User: NewUser
 */
public class WorldEditUtils {
    public static WorldEditPlugin worldEdit = (WorldEditPlugin) Bukkit.getServer().getPluginManager().getPlugin("WorldEdit");
    public static PlayerUtils playerUtils = new PlayerUtils();

    /**
     * Retrieve the player's current WorldEdit region.
     * @param player   The player that we are getting the WorldEdit region from.
     * @return         Returns a list containing the player's current World, Minimum and Maximum region points.
     */
    public List<Object> getWorldEditRegion(Player player) {
        Selection selection = worldEdit.getSelection(player);

        if (selection == null)
            playerUtils.sendPlayerErrorMessage(player, ChatStrings.WORLD_EDIT_REGION_NEEDED.getMessage());

        World world = selection.getWorld();
        Location min = selection.getMinimumPoint();
        Location max = selection.getMaximumPoint();
        return Arrays.asList(world, min, max);
    }
}
