
package hashtagdemocracy;

import hashtagdemocracy.events.VotingHandler;
import hashtagdemocracy.monthsHandler.TimerThread;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author baileypellow
 */
public final class HashtagDemocracy extends JavaPlugin{
    //When the plan comes out we can sort out who does what.
	
	TimerThread thread = new TimerThread();
	Boolean isVoteDay = false;
	
    @Override
    public void onEnable(){
        thread.start();
        Bukkit.getPluginManager().registerEvents( new VotingHandler(this) , this ); // Register the voting handler
    }
    
    @Override
    public void onDisable(){
    	thread.cancel();
    }
    
    public boolean canVote(){
    	return isVoteDay;
    }
    
    public void setCanVote(Boolean newVal){
    	isVoteDay = newVal;
    }
    
}
