package com.dakanndesigns.hungrygames.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * These are just a few Player based utility functions
 * Creator: David Jenkins
 */
public class PlayerUtils {
    /**
     * Sends the player, only, the message that is attached.
     * @param player    The player that will receive the message
     * @param message   The message that should be sent to the player
     */
    public void sendPlayerMessage(Player player, String message)
    {
        player.sendMessage(ChatColor.GREEN + message);
    }

    /**
     * Sends the player, only, the error message that is attached.
     * @param player
     * @param message
     */
    public void sendPlayerErrorMessage(Player player, String message)
    {
        player.sendMessage(ChatColor.RED + message);
    }
}
