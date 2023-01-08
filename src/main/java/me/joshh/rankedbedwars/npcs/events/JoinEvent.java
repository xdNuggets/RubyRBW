package me.joshh.rankedbedwars.npcs.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (!NPC.getNPCs().isEmpty()) {
            NPC.addJoinPacket(e.getPlayer());
        }
    }
}
