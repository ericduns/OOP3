package problemSet1;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class PlayerList {
	
	public static void main(String [] args)throws IOException 
		{
			String text = "";
			int i=0;
			Player player1 = new Player();
			Player player2 = new Player();
			LinkedList<Player> myPlayers;
			myPlayers = new LinkedList<Player>();
			ObjectOutputStream out;
			out = new ObjectOutputStream(new FileOutputStream("players.dat"));
			
			
			player1.setName(JOptionPane.showInputDialog("Enter your name: "));
			player1.setScore(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of goals scored : ")));
			player1.setOnline(Boolean.parseBoolean(JOptionPane.showInputDialog("Is the player online<true or false>: ")));
			myPlayers.add(player1);
			
			player2.setName(JOptionPane.showInputDialog("Enter your name: "));
			player2.setScore(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of goals scored : ")));
			player2.setOnline(Boolean.parseBoolean(JOptionPane.showInputDialog("Is the player online<true or false>: ")));
			myPlayers.add(player2);
			
			
			out.writeObject(myPlayers);
			
			out.close();
		/*	for(Player p : myPlayers)
			{
				text+= myPlayers;
				i++;
			}
			JOptionPane.showMessageDialog(null,myPlayers);*/
		}
}