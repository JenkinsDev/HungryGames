package com.dakanndesigns.hungrygames.enums;

/**
 * A chat enumeration that holds all possible chat values.
 * Creator: David Jenkins
 */
public enum Chat {
    WORLD_EDIT_REGION_NEEDED("You need to select a WorldEdit region first."),
    NO_PERMISSIONS("You don't have the required permissions to run that command.");

    private String message;

    private Chat(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }
}
