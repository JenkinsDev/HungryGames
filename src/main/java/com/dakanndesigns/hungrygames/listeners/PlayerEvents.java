package com.dakanndesigns.hungrygames.listeners;

import com.dakanndesigns.hungrygames.utils.PlayerUtils;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

/**
 * Here we will handle any and all player listeners.
 * Creator: David Jenkins
 */
public final class PlayerEvents implements Listener {
    private static PlayerUtils playerUtils = new PlayerUtils();

    @EventHandler
    public void onDeathEvent(EntityDeathEvent event)
    {
        // The entity wasn't a player so lets bail.
        if (!(event.getEntity() instanceof Player))
            return;

        Player player = (Player) event.getEntity();

        // Lets grab the player's death location and force a Lighting Strike 'Effect'
        Location playerLocation = player.getLocation();
        player.getWorld().strikeLightningEffect(playerLocation);
    }
}
