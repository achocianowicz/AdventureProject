package com.example.joydr.adventure;

public class CurrentPlayer {
public static String playerName = null;
public static String playerPassword = null;
public static String playerClass = null;

public static Integer health = null;
public static Integer magic = null;

    public CurrentPlayer() {
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        CurrentPlayer.playerName = playerName;
    }

    public static String getPlayerPassword() {
        return playerPassword;
    }

    public static void setPlayerPassword(String playerPassword) {
        CurrentPlayer.playerPassword = playerPassword;
    }

    public static String getPlayerClass() {
        return playerClass;
    }

    public static void setPlayerClass(String playerClass) {
        CurrentPlayer.playerClass = playerClass;
    }

    public static Integer getHealth() {
        return health;
    }

    public static void setHealth(Integer health) {
        CurrentPlayer.health = health;
    }

    public static Integer getMagic() {
        return magic;
    }

    public static void setMagic(Integer magic) {
        CurrentPlayer.magic = magic;
    }
}
