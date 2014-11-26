package hashtagdemocracy.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class VotingHandler extends Listener{
  
  @EventHandler
  public void endElectoral(TimeExpired event){
    // End the current electoral code here...
    System.out.println("Ending the current electoral..");
  }
  
  @EventHandler
  public void startVoting(StartVoting event){
    // Allow the players to start voting
    System.out.println("Allowing the players to vote for one day..");
  }
  
  @EventHandler
  public void endVoting(EndVoting event){
    // Don't allow the players to vote anymore
    System.out.println("Players can no longer vote..");
  }
  
}
