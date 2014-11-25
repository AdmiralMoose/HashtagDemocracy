

package hashtagdemocracy;

import java.util.HashMap;

public class VoteCounter{
    public static HashMap<String, Integer> partyVote = new HashMap<>(); //playerName, party
    public static HashMap<String, Integer> mpVote = new HashMap<>(); //playerName, mp
    private static HashtagDemocracy plugin;
    public VoteCounter(HashtagDemocracy instance){
plugin = instance;
}
    public static void partyVoteAdd(String player, int partyNum){
        partyVote.put(player, partyNum);
    }
    public static void mpVoteAdd(String player, int mpNum){
        mpVote.put(player, mpNum);
    }
    public static boolean hasVotedParty(String player){
return partyVote.containsKey(player);
}
    public static boolean hasVotedMP(String player){
return mpVote.containsKey(player);
}
}
