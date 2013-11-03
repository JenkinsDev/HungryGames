package com.dakanndesigns.hungrygames.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

/**
 * Here we will handle any and all player events.
 * Creator: David Jenkins
 */
public final class PlayerEvents implements Listener {

    @EventHandler
    public void onDeathEvent(EntityDeathEvent event) {
        if (!(event.getEntity() instanceof Player))
            return;
    }
}
