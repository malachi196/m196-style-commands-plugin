package src.main.java.com.m196.projects;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.Plugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandSender.Spigot;
import org.bukkit.util.StringUtil;
import org.checkerframework.checker.units.qual.h;
import org.bukkit.ChatColor;
import org.bukkit.Difficulty;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.advancement.Advancement;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.NamespacedKey;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionBrewer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionEffectTypeCategory;
import org.bukkit.potion.PotionType;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import src.main.java.com.m196.projects.commands.dropanvil;
import src.main.java.com.m196.projects.commands.adminstick;
import src.main.java.com.m196.projects.commands.nm;
//to build da jar run 'mvn clean package' to make da jar file

public final class m196stylecommands extends JavaPlugin{
    private Logger logg = Bukkit.getLogger();
    @Override
    public void onEnable()
    {
        logg.info("\"m196-style commands\" IS NOW ONLINE!!!!");
        this.getCommand("dropanvil").setExecutor(new dropanvil());
        this.getCommand("adminstick").setExecutor(new adminstick());
        this.getCommand("nm").setExecutor(new nm());
    }
    @Override
    public void onDisable()
    {
        logg.info("Now shutting down msc!");
        logg.info("msc: Bye bye!");
    }
}
