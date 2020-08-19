package ArmorStand;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.ArmorStand;
public class ArmorStandCMD implements CommandExecutor{
		
	
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[]args) {
		
		
		
		
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			Location loc = p.getLocation();
			if (command.getName().equalsIgnoreCase("potato")) {
			      ArmorStand nameTag = (ArmorStand) p.getWorld().spawn(loc, ArmorStand.class);
			      
			      nameTag.setGravity(false);
			    } 
			
			
			
		}return true;
	}
	
}
