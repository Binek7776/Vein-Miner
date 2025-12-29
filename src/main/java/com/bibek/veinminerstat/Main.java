package com.bibek.veinminerstat;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new VeinMinerListener(this), this);
        getLogger().info("VeinMinerStatPlugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("VeinMinerStatPlugin disabled!");
    }
}
