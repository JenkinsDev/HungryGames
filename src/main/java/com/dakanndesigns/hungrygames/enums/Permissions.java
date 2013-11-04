package com.dakanndesigns.hungrygames.enums;

/**
 * An enumeration handling all plugin permission strings.
 * Creator: David Jenkins
 */
public enum Permissions {
    USER("hungrygames.player.user"),
    MOD("hungrygames.player.mod"),
    ADMIN("hungrygames.player.admin");

    private String permissionString;

    private Permissions(String permissionString)
    {
        this.permissionString = permissionString;
    }

    public String getPermissionString()
    {
        return permissionString;
    }
}
