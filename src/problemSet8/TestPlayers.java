package problemSet8;

import java.util.*;

public class TestPlayers {

	public static void main(String[] args) {

		Player p1 ;
		List<Player>setPlayer = new LinkedList<Player>();

		p1 = new Player("Mike" , 12);
		setPlayer.add(p1);
		p1 = new Player("Sean" , 14);
		setPlayer.add(p1);
		p1 = new Player("John" , 9);
		setPlayer.add(p1);
		p1 = new Player("Alan" , 14);
		setPlayer.add(p1);
		p1 = new Player("Paul" , 16);
		setPlayer.add(p1);
		p1 = new Player("Stephen" , 10);
		setPlayer.add(p1);

		//Unsorted names
		for(Player p : setPlayer)
		{
			System.out.print(p.getName() + " ");
		}

		Collections.sort( setPlayer, new ComparePlayerNames());

		System.out.println();

		//Sorted Names
		for(Player p2 : setPlayer)
		{
			System.out.print(p2.getName() + " ");
		}

		System.out.println("\n");

		//Unsorted Scores
		for(Player p3 : setPlayer)
		{
			System.out.print(p3.getScore() + " ");
		}

		Collections.sort( setPlayer, new ComparePlayerScore());

		System.out.println("\n");

		//Sorted Scores
		for(Player p : setPlayer)
		{
			System.out.print(p.getScore() + " ");
		}



	}

}