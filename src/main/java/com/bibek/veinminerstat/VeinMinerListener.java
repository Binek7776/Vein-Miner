package com.bibek.veinminerstat;

import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.HashSet;
import java.util.Set;

public class VeinMinerListener implements Listener {

    private final Main plugin;
    private final Set<Material> ores = new HashSet<>();

    public VeinMinerListener(Main plugin) {
        this.plugin = plugin;
        ores.add(Material.DIAMOND_ORE);
        ores.add(Material.COAL_ORE);
        ores.add(Material.IRON_ORE);
        ores.add(Material.GOLD_ORE);
        ores.add(Material.REDSTONE_ORE);
        ores.add(Material.LAPIS_ORE);
        ores.add(Material.EMERALD_ORE);
        ores.add(Material.COPPER_ORE);
        ores.add(Material.NETHER_QUARTZ_ORE);
        ores.add(Material.NETHER_GOLD_ORE);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlock();

        if (ores.contains(block.getType())) {
            player.incrementStatistic(Statistic.MINE_BLOCK, 1);
        }
    }
}
