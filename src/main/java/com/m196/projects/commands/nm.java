package src.main.java.com.m196.projects.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import src.main.java.com.m196.projects.backend.runcommand;

public class nm implements CommandExecutor{
    runcommand commandthing = new runcommand(); //use to run commands
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender instanceof Player){
            if (cmd.getName().equalsIgnoreCase("nm")){
                nutritionalMaceHandler(sender);
                return true;
            }
            return false;
        }
        return false;
    }
    public void nutritionalMaceHandler(CommandSender sender){
        String target = sender.getName();
        commandthing.runMinecraftCommand("minecraft:give " + target + " mace[food={nutrition:20, saturation:1}]", sender);
    }
}
