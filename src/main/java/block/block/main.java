package block.block;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
