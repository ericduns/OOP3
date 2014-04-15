package problemSet8;

import java.util.Comparator;


public class ComparePlayerNames implements Comparator<Player>{

	public int compare(Player p1, Player p2) {

		return p1.getName().compareToIgnoreCase(p2.getName());
	}


}