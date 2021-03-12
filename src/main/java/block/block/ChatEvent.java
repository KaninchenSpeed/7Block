package block.block;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.jetbrains.annotations.NotNull;

public class ChatEvent implements @NotNull Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        if (e.getMessage().startsWith("7") && e.getMessage().length() > 1) {
            e.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Message blocked!");
        }
    }
}
