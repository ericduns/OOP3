package problemSet6;

import java .util.*;
public class ComparePlayerScores implements Comparator<Player> {
   public int compare(Player p1, Player p2){
   	  if (p1.getScore() > p2.getScore())
   	    return +1;
   	  else if (p1.getScore() == p2.getScore() && p1.getName().equalsIgnoreCase(p2.getName()))
   	  	return 0;
   	  else
   	  	return -1;
   }


 }
