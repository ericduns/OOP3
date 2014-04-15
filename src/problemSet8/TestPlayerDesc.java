package problemSet8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class TestPlayerDesc {

	public static void main(String[] args) {

		Player [] p1 = new Player[6] ;


		p1[0] = new Player("Mike" , 12);

		p1[1] = new Player("Sean" , 14);

		p1[2] = new Player("John" , 9);

		p1[3] = new Player("Alan" , 14);

		p1[4] = new Player("Paul" , 16);

		p1[5] = new Player("Stephen" , 10);

		//Unsorted Names
		for(Player  p : p1)
		{
			System.out.print(p.getName() + "  ");
		}

		//Sorted names
		System.out.println();
		Arrays.sort(p1 , new ComparePlayerNames());

		for(Player  p2 : p1)
		{
			System.out.print(p2.getName() + "  ");
		}

		//Unsorted Scores
		System.out.println();

		for(Player  p3 : p1)
		{
			System.out.print(p3.getScore() + "  ");
		}


		//Sorted Scores
		System.out.println();
		Arrays.sort(p1 , new ComparePlayerScore());

		for(Player  p4 : p1)
		{
			System.out.print(p4.getScore() + "  ");
		}

		//Score in reverse
		System.out.println();
		Arrays.sort(p1 , new ComparepPlayerDesc());

		for(Player  p4 : p1)
		{
			System.out.print(p4.getScore() + "  ");
		}
	}
}