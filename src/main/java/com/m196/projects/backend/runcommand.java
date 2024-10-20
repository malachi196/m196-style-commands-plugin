package src.main.java.com.m196.projects.backend;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class runcommand {
    public void runMinecraftCommand(String command, CommandSender sender)
    {
        Bukkit.dispatchCommand(sender, command);
    }
}