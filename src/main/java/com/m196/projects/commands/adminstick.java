package src.main.java.com.m196.projects.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import src.main.java.com.m196.projects.backend.runcommand;

public class adminstick implements CommandExecutor{
    runcommand commandthing = new runcommand(); //use to run commands
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender instanceof Player){
            if (cmd.getName().equalsIgnoreCase("adminstick")){
                adminstickHandler(sender);
                return true;
            }
            return false;
        }
        return false;
    }
    public void adminstickHandler(CommandSender sender){
        String target = sender.getName();
        commandthing.runMinecraftCommand("minecraft:give " + target + " stick[minecraft:attribute_modifiers=[{id:\"attack_damage\", type:\"generic.attack_damage\",amount:10000, operation:\"add_value\"}], minecraft:custom_name=\"'Admin Stick'\", minecraft:enchantments={levels:{channeling:1}}, minecraft:unbreakable={unbreaking:1}] 1", sender);
    }
}
