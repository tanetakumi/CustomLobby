package net.serveron.mcstar.customlobby.Listener;

import net.serveron.mcstar.customlobby.CustomLobby;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    private CustomLobby plugin;

    public JoinEvent(CustomLobby plugin){
        this.plugin = plugin;

    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(!e.getPlayer().hasPermission("op")){
            e.getPlayer().getInventory().clear();
        }
    }
}
