package com.dakanndesigns.hungrygames.listeners;

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
    @EventHandler
    public void onDeathEvent(EntityDeathEvent event) {
        if (!(event.getEntity() instanceof Player))
            return;

        Player player = (Player) event.getEntity();

        Location playerLocation = player.getLocation();
        player.getWorld().strikeLightningEffect(playerLocation);
    }
}
