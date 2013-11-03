package com.dakanndesigns.hungrygames;

import com.dakanndesigns.hungrygames.events.PlayerEvents;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main HungryGames Class File
 * Creator: David Jenkins
 */
public class HungryGames extends JavaPlugin {
    @Override
    public void onEnable()
    {
        // Lets load up our default config file in case it is empty
        this.saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new PlayerEvents(), this);
    }

    @Override
    public void onDisable()
    {

    }
}
