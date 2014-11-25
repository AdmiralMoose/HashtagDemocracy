

package hashtagdemocracy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class CMDManager implements CommandExecutor{
        @Override
    public boolean onCommand(CommandSender cs, Command command, String s, String[] args){
        if(!cs.hasPermission("hashtagdemocracy.player")){
            cs.sendMessage("You do not have permission to execute this command.");
        }else{
            
        }
        return true;
    }
}
