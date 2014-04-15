package problemSet8;

import java.util.*;


public class StudentGames {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Map <String , String> stGames ;

		stGames = new TreeMap<String , String>( );

		stGames.put("Paul","Snooker");
		stGames.put("Sean","Rugby");
		stGames.put("Peter","Basketball");
		stGames.put("Keira","Squash");
		stGames.put("Sarah","RacketBall");
		stGames.put("Chloe","Tennis");

		System.out.print("The Collection " + stGames);
		System.out.println("\n" + stGames.values());


		System.out.print("\n\nEnter the Players name ");
		String name= in.nextLine();


		System.out.println("\n");
		if (stGames.containsKey(name))
		    System.out.println(name + " teaches " + stGames.get(name) );
		else
		    System.out.println("no matching values");
	}
}