package problemSet6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class BicycleDriver extends JFrame implements ActionListener {

	private int choice,i;
	Bicycle bikes;
	JPanel panel, displayPanel;
	Set<Bicycle> bikeSet;
	JTextArea area;
	JMenuBar bar;
	JMenu bMenu;
	JMenuItem item;
	JScrollPane pane;
	JFrame frame;

	public BicycleDriver() {
		super("Invoking Comparable");
		setSize(400, 360);
		setLocation(300, 300);
		setLayout(new FlowLayout());
		panel = new JPanel();
		bar = new JMenuBar();
		panel.add(bar);
		setJMenuBar(bar);
		bikeMenu();
		JLabel lbl = new JLabel(new ImageIcon("bike.jpg"));
		add(lbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void newBikes() {
		bikeSet = new HashSet<Bicycle>();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new BicycleDriver();
			}
		});
	}

	public void add() {
		
		while (choice == JOptionPane.YES_OPTION) {
			String owner = JOptionPane.showInputDialog("Enter the owners name");
			String make = JOptionPane.showInputDialog(null,"Enter the make of the bike");
			double value = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the bike"));
			choice = JOptionPane.showConfirmDialog(null, "More bikes to enter");	
			bikes = new Bicycle(owner,value);
			bikes.setMake(make);
			bikeSet.add(bikes);
			i++;
		}
		JOptionPane.showMessageDialog(null,bikeSet);

	}

	public void display()throws NullPointerException {
		String show = "";
		char choice = JOptionPane.showInputDialog(null,"Would you like to display in order of<O owner V value").toUpperCase().charAt(0);
		
		if(choice == 'O')
		{
			
			Set<Bicycle> displayBikes = new TreeSet<Bicycle>(new CompareOwner());
			displayBikes.addAll(bikeSet);
			Iterator <Bicycle> it = displayBikes.iterator();
				
			while(it.hasNext())
				{
					show += it.next();
				}
				JOptionPane.showMessageDialog(null,show);
		}
		else if(choice =='V' )
			{
				Set<Bicycle> displayBikes2 = new TreeSet<Bicycle>(new ComparePrice());
				displayBikes2.addAll(bikeSet);
				Iterator <Bicycle> it = displayBikes2.iterator();
				
				while(it.hasNext())
					{
						show += it.next(); 
					}
					JOptionPane.showMessageDialog(null,show);
		}
		
	}

	public void bikeMenu() {

		bMenu = new JMenu("Default");
		item = new JMenuItem("New File");
		item.addActionListener(this);
		bMenu.add(item);
		item = new JMenuItem("Add Bikes");
		item.addActionListener(this);
		bMenu.add(item);
		item = new JMenuItem("Display");
		item.addActionListener(this);
		bMenu.add(item);
		bMenu.addSeparator();
		item = new JMenuItem("Exit");
		item.addActionListener(this);
		bMenu.add(item);
		bar.add(bMenu);
	}

	public void actionPerformed(ActionEvent e) {
		String choice = e.getActionCommand();
		if (choice.equals("Exit")) {
			System.exit(0);
		} else if (choice.equals("Add Bikes")) {
			add();
		} else if (choice.equals("Display")) {	
			display();
		} else if (choice.equals("New File")) {
			newBikes();
		}

	}

}
