package com.dakanndesigns.hungrygames.utils;

import com.dakanndesigns.hungrygames.HungryGames;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.metadata.MetadataValue;

import java.util.List;

/**
 * These are just a few Player based utility functions
 * Creator: David Jenkins
 */
public class PlayerUtils {
    /**
     * Sends the player, only, the message that is attached.
     *
     * @param player  The player that will receive the message
     * @param message The message that should be sent to the player
     */
    public void sendPlayerMessage(Player player, String message)
    {
        player.sendMessage(ChatColor.GREEN + message);
    }

    /**
     * Sends the player, only, the error message that is attached.
     *
     * @param player  The player that will receive the message
     * @param message The message that should be sent to the player
     */
    public void sendPlayerErrorMessage(Player player, String message)
    {
        player.sendMessage(ChatColor.RED + message);
    }

    /**
     * Sends a message only to players that are currently in the specified game.
     *
     * @param message  The message that should be sent to players in the match.
     */
    public void sendPlayersInGameMessage(String match, String message)
    {
        for (Player player : HungryGames.plugin.getServer().getOnlinePlayers())
        {
            Object metaData = getPlayerMetadataValue(player, "hungrygames.in.game");

            if (metaData == null)
                continue;

            if (metaData != match)
                continue;

            player.sendMessage(ChatColor.AQUA + message);
        }
    }

    /**
     * Attempts to retrieve the player's metadata value based on the metadataKey, if it is not found then we
     * just return null.
     *
     * @param player       The player we are checking against.
     * @param metadataKey  The metadataKey that we are checking with.
     * @return  The metadataKey's value or null.
     */
    public Object getPlayerMetadataValue(Player player, String metadataKey)
    {
        List<MetadataValue> values = player.getMetadata(metadataKey);
        for (MetadataValue value : values)
        {
            if (!value.getOwningPlugin().getName().equals(HungryGames.plugin.getName()))
                continue;

            return value.value();
        }

        return null;
    }
}
