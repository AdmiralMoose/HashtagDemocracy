
package hashtagdemocracy;

import hashtagdemocracy.monthsHandler.TimeExpired;
import hashtagdemocracy.monthsHandler.TimerThread;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author baileypellow
 */
public final class HashtagDemocracy extends JavaPlugin implements Listener{
    //When the plan comes out we can sort out who does what.
	
	TimerThread thread = new TimerThread();

    @Override
    public void onEnable(){
        thread.start();
        Bukkit.getPluginManager().registerEvents(this, this);
    }
    
    @Override
    public void onDisable(){
    	thread.cancel();
    }
    
    @EventHandler
    public void threeMonths(TimeExpired time){
    	Bukkit.broadcastMessage("Time has expired, time to vote!");
    }
    
}
