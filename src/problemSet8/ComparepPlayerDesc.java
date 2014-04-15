package problemSet8;

import java.util.Comparator;


public class ComparepPlayerDesc implements Comparator<Player>{

	public int compare(Player p1, Player p2) {
		int largest = 0;

		if(p1.getScore() > p2.getScore())
		{	
			return -1;
		}
		else if(p1.getScore() == p2.getScore())
			{
				return 0;
			}
			else 
				{
				return 1;
				}
	}
}