package hashtagdemocracy.monthsHandler;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class EndVoting extends Event {
	
  	public static HandlerList handlers = new HandlerList();

    private boolean cancelled;
 
    public EndVoting() {
        
    }
 
    public boolean isCancelled() {
        return cancelled;
    }
 
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }
 
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
