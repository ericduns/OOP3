package problemSet5;

import java.util.HashSet;
import java.util.Set;
import java.awt.*;
import javax.swing.*;

public class Darts {

	public static void main(String[] args) {
		
		Set<Player> player = new HashSet<Player>();
		Player p1;
		JTextArea area = new JTextArea();
		area.setFont(new Font("monospaced",Font.PLAIN,12));
		
		int choice = JOptionPane.YES_OPTION;
		
		while(choice == JOptionPane.YES_OPTION)
		{
			String name = JOptionPane.showInputDialog("Enter your name");
			int score = Integer.parseInt(JOptionPane.showInputDialog("Enter your score"));
		
			p1 = new Player(name,score);
			player.add(p1);
			
			choice = JOptionPane.showConfirmDialog(null,"Do you want to add another player");
		}
		area.setText(String.format(("Player Details\n")));
		for(Player p : player)
		{
			area.append(p.toString() + "\n");
		}
		JOptionPane.showMessageDialog(null,area);
	}

}
