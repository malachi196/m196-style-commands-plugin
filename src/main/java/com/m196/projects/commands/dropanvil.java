package src.main.java.com.m196.projects.commands;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.Material;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class dropanvil implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender instanceof Player){
            if (cmd.getName().equalsIgnoreCase("dropanvil")){
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
        sender.sendMessage("May " + target + " be anvil'd!"); //This sends a message to the player
        Player targetPlayerObject = Bukkit.getPlayerExact(target);
        if (targetPlayerObject == null){
            sender.sendMessage("player not available");
            return;
        }
        Location location = targetPlayerObject.getLocation().add(0, 15, 0);
        Block block = location.getBlock();

        block.setType(Material.ANVIL);
    }
}