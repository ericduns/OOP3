package problemSet1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GameDriver extends JFrame {
   
   private int j=0,i=0;
   GoodBad goodGuy,badGuy;
    
   private JButton goodBtn,badBtn;
   private JLabel goodLbl,badLbl;
   private JFrame frame = new JFrame();
   private JPanel con;
   private JTextArea area = new JTextArea(5,30);
   private JTextArea area2 = new JTextArea(5,30);
   
    public GameDriver() 
    {
    	super("GoodGuy BadGuy");
    	setLayout(new BorderLayout());
    	setSize(300,320);
    	setLocation(300,300);
    	createPlayers();
    	display();
    	setVisible(true);
    	setResizable(false);
      	setDefaultCloseOperation(EXIT_ON_CLOSE);		
  	}
    
   
    public static void main(String[] args) 
    {
    	
      GameDriver game = new GameDriver();
      
    }
    public class BtnHandler implements ActionListener{
    	
    	public void actionPerformed(ActionEvent e)
    	{
    		if(e.getSource()== goodBtn)
    		{
    			b_Guy();
    		
    			}
    	
    	    else if(e.getSource() == badBtn)
    		{
    			g_Guy();
    		}
    	}
    }
    public void g_Guy()
    {
    	
    	area2.setText(String.format("%-20s\n%-10s%-10s%-4s\n%-10d%-10d%d ",
    	"Good Guy","Shot","Ammo","Strength",j, goodGuy.getAmmo(),goodGuy.getStrength()));
    	j++;	
    
    	if(goodGuy.getStrength()<= 0)
    	{
    		goodGuy.aliveStatus(false);
    		JOptionPane.showMessageDialog(null,"Bad guy is dead\n"+goodGuy.toString());
    		System.exit(0);			
        }
    }
    public void b_Guy()
    {
    	area.setText(String.format("%-20s\n%-10s%-10s%-4s\n%-10d%-10d%d ",
    	"Bad Guy","Shot","Ammo","Strength",i, badGuy.getAmmo(),badGuy.getStrength()));
    	
    	i++;
    	
    	if(badGuy.getStrength()<= 0)
    	{
    		badGuy.aliveStatus(false);
    		JOptionPane.showMessageDialog(null,"Bad guy is dead\n"+badGuy.toString());
    		System.exit(0);	
    	}
    }
    public void createPlayers()
    {
    	String name;
    	int ammo,strength;
    	
    	name = JOptionPane.showInputDialog("Enter the name of player 1");
    	ammo = Integer.parseInt(JOptionPane.showInputDialog("Enter the players ammo "));
    	strength = Integer.parseInt(JOptionPane.showInputDialog("Enter the players Strength "));
    	goodGuy = new GoodBad(name,ammo,strength);
    	
    	name = JOptionPane.showInputDialog("Enter the name of player 2");
    	ammo = Integer.parseInt(JOptionPane.showInputDialog("Enter the players ammo "));
    	strength = Integer.parseInt(JOptionPane.showInputDialog("Enter the players Strength "));
    	badGuy = new GoodBad(name,ammo,strength);
    }
    public void display()
    {
    	con = new JPanel();
    	area.setFont(new Font("monospaced",Font.PLAIN,12));
    	con.add(area);
    	goodBtn = new JButton("Good Guy shoots Bad Guy");
    	con.add(goodBtn);
    	area2.setFont(new Font("monospaced",Font.PLAIN,12));
    	con.add(area2);
    	badBtn = new JButton("Bad Guy shoots Good guy");
    	con.add(badBtn);
    	BtnHandler handler = new BtnHandler();
    	goodBtn.addActionListener(handler);
    	badBtn.addActionListener(handler);
    	add(con);
        }
}
