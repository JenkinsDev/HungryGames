package com.dakanndesigns.hungrygames;

import com.dakanndesigns.hungrygames.events.PlayerEvents;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main HungryGames Class File
 * Creator: David Jenkins
 */
public class HungryGames extends JavaPlugin {
    public static HungryGames plugin;

    @Override
    public void onEnable()
    {
        // Lets load up our default config file in case it is empty
        this.saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new PlayerEvents(), this);

        // Setup a static property for use within our code.
        plugin = this;
    }

    @Override
    public void onDisable()
    {

    }
}
