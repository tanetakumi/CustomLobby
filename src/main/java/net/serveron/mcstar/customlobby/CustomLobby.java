package net.serveron.mcstar.customlobby;

import net.serveron.mcstar.customlobby.Listener.JoinEvent;
import net.serveron.mcstar.customlobby.Listener.JumpTeleport;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Lobby Plugin Init");
        new JoinEvent(this);
        new JumpTeleport(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Lobby Plugin Deinit");
    }
}
