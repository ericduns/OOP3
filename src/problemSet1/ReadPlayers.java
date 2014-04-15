package problemSet1;

import java.io.*;
import javax.swing.*;
import java.util.*;

public class ReadPlayers {
	
	public static void main(String [] args)throws IOException,ClassNotFoundException
	{
		Player player = null;
		LinkedList <Player> readTeam;
		readTeam = new LinkedList<Player>();
		int i=0,highscore=0;
		String text="";
		
		ObjectInputStream in;
		in = new ObjectInputStream(new FileInputStream("players.dat"));
		readTeam = (LinkedList <Player>) in.readObject();
		in.close();
		
		for(Player p1: readTeam)
			{
			if (i == 0)
				{
					highscore = p1.getScore();
					player = readTeam.get(i);
					i++;
				}
				
				else if (highscore < p1.getScore())
				{
					highscore = p1.getScore();
					player = readTeam.get(i);
					i++;
					text+=p1.getName();
				}
			}
				JOptionPane.showMessageDialog(null,readTeam+ "\nThe player with the highest score is "+text);
		
		
		
		
	}
	
}