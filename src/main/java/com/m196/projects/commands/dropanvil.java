package src.main.java.com.m196.projects.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import src.main.java.com.m196.projects.backend.runcommand;

public class dropanvil implements CommandExecutor {
    runcommand commandthing = new runcommand(); //use to run commands
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender instanceof Player){
            if (cmd.getName().equalsIgnoreCase("dropanvil")){ //maybe fix if args not work?
                String target;
                if (args.length == 0){
                    target = sender.getName();
                } else {
                    target = args[0];
                }
                dropAnvilHandler(sender, target);
                return true;
            }
            return false;
        }
        return false;
    }
    public void dropAnvilHandler(CommandSender sender, String target)
    {
        sender.sendMessage("May they be anvil'd!"); //This sends a message to the player
        commandthing.runMinecraftCommand("execute at " + target + " run setblock ~ ~15 ~ anvil", sender);
    }
}