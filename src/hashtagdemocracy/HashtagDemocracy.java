
package hashtagdemocracy;

import hashtagdemocracy.monthsHandler.TimeExpired;
import hashtagdemocracy.monthsHandler.TimerThread;
import hashtagdemocracy.events.VotingHandler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author baileypellow
 */
public final class HashtagDemocracy extends JavaPlugin{
    //When the plan comes out we can sort out who does what.
	
	TimerThread thread = new TimerThread();

    @Override
    public void onEnable(){
        thread.start();
        Bukkit.getPluginManager().registerEvents( new VotingHandler() , this ); // Register the voting handler
    }
    
    @Override
    public void onDisable(){
    	thread.cancel();
    }
    
}
