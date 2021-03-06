package hashtagdemocracy.monthsHandler;

import hashtagdemocracy.events.EndVoting;
import hashtagdemocracy.events.StartVoting;
import hashtagdemocracy.events.TimeExpired;

import org.bukkit.Bukkit;

public class TimerThread extends Thread{
	
	int days = 0;
		
	/**
	 * Timer thread is to be started with the plugin
	 * This thread will always run in the background
	 * Everytime 3 months (In minecraft) passes
	 * it will call {@link TimeExpired}
	 */ 
	public TimerThread(){
	}
	
	public void run(){
		try{
			
			while ( ! Thread.currentThread().isInterrupted() ){
				Thread.sleep( ((1000 * 60) *60) *24 ); // Sleep for 1 REAL day -> MC day = (1000 * 60) *20
				days++;
				if ( days == (31 *3) ){
					endElectoral(); // End the current peoples' roles to start anew
					startVotes(); // Allow the players to votr
					Thread.sleep( ((1000 * 60) *60) *24 ); // Sleep for one real day
					endVoting(); // Don't allow the players to vote anymore
					days = 0;
				}else{
					int daysLeft = (31 * 3) - days;
					if ( daysLeft == 31 || daysLeft == 62){
						Bukkit.broadcastMessage("You have " + daysLeft + " day(s) left until the next electoral!");
					}
				}
			}
		}catch (InterruptedException e){
			//Let the thread die
		}
	}
	
	public void cancel(){
		interrupt();
	}
	
	private void endElectoral(){
		TimeExpired event = new TimeExpired();
		Bukkit.getPluginManager().callEvent(event);
	}
	
	private void startVotes(){
		StartVoting event = new StartVoting();
		Bukkit.getPluginManager().callEvent(event);
	}
	private void endVoting(){
		EndVoting event = new EndVoting();
		Bukkit.getPluginManager().callEvent(event);
	}
	
}
