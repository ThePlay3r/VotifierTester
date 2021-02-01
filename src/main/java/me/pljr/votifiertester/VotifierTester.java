package me.pljr.votifiertester;

import me.pljr.votifiertester.commands.VotifierTesterCommand;
import me.pljr.votifiertester.listeners.VotifierListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class VotifierTester extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new VotifierTesterCommand().registerCommand(this);
        getServer().getPluginManager().registerEvents(new VotifierListener(getServer().getConsoleSender()), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
