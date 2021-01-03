package net.serveron.mcstar.customlobby;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Lobby Plugin Init");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Lobby Plugin Deinit");
    }
}
