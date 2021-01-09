package net.serveron.mcstar.customlobby.Listener;

import net.serveron.mcstar.customlobby.CustomLobby;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;

public class JumpTeleport implements Listener {
    private CustomLobby plugin;

    public JumpTeleport(CustomLobby plugin){
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void playerJump(PlayerStatisticIncrementEvent e) {
        if(e.getStatistic()== Statistic.JUMP){
            Location loc = e.getPlayer().getLocation();
            Block block = loc.getBlock().getRelative(BlockFace.DOWN);
            if(loc.getBlockY()==1){
                e.getPlayer().teleport(new Location(block.getWorld(),0,45,0));
            }
            if(block.getType() == Material.BLUE_WOOL){
                e.getPlayer().teleport(new Location(block.getWorld(),63,53,0));
            }

        }
    }
}
