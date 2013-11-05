package com.dakanndesigns.hungrygames.enums;

import com.dakanndesigns.hungrygames.HungryGames;

/**
 * A chat enumeration that holds all possible chat values.
 * Creator: David Jenkins
 */
public enum ChatStrings {
    WORLD_EDIT_REGION_NEEDED("You need to select a WorldEdit region first."),
    NO_PERMISSIONS("You don't have the required permissions to run that command."),
    PLAYER_DIED_GENERIC("deathmessage.generic", true),
    PLAYER_DIED_FALL("deathmessage.fell", true),
    PLAYER_DIED_FIRE("deathmessage.burnt", true),
    PLAYER_DIED_FLAWLESS("deathmessage.flawless", true),
    PLAYER_DIED_GHAST("deathmessage.ghast", true),
    PLAYER_DIED_HOUND("deathmessage.hound", true);

    private String message;

    private ChatStrings(String message)
    {
        this.message = message;
    }

    /**
     * ChatStrings constructor to grab the enum's string from the configuration file.
     *
     * @param configString  The configuration type.
     * @param isConfig     The configuration's
     */
    private ChatStrings(String configString, Boolean isConfig)
    {
        this.message = HungryGames.pluginConfig.getString(configString);
    }

    public String getMessage()
    {
        return message;
    }
}
