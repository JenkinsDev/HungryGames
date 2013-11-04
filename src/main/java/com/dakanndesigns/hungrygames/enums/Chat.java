package com.dakanndesigns.hungrygames.enums;

/**
 * A chat enumeration that holds all possible chat values.
 * Creator: David Jenkins
 */
public enum Chat {
    WORLD_EDIT_REGION_NEEDED("You need to select a WorldEdit region first.");

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
