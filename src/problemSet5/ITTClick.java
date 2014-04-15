package problemSet5;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class ITTClick extends JFrame implements ActionListener{

	Container con = new Container();
	JComboBox<Set> combo;
	JButton btn1;
	JLabel label ;
	public ITTClick()
	{
		super("Club Choice");
		setSize(200,200);
		setLocation(300,300);
		setLayout(new FlowLayout());
		btn1 = new JButton("Remove");
		btn1.addActionListener(this);
		add(btn1);
		con = getContentPane();
		addClubs();
		
	}
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			
			public void run()
			{
				ITTClick cl = new ITTClick();
				cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
				cl.setVisible(true);
			}
		});
		
	}
	public void addClubs()
	{
		int i=0;
		Vector<String> clubs = new Vector<String>();
		int choice = JOptionPane.YES_OPTION;
		String preferedClubs = "";
		
		while(choice == JOptionPane.YES_OPTION )
		{
		   preferedClubs = JOptionPane.showInputDialog("Enter the clubs you would like to join ");
		
		choice = JOptionPane.showConfirmDialog(null, "More clubs to enter","Club Choice",JOptionPane.YES_NO_OPTION );
		clubs.add(preferedClubs + "\n");
		i++;
		}
		 combo = new JComboBox(clubs);
		combo.addActionListener(this);
		con.add(combo);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == btn1)
			{
				int position = combo.getSelectedIndex();
				combo.removeItemAt(position);
				ImageIcon icon = new ImageIcon("smiley.jpg");
				message("Scccessfully removed");
			}
		
	}
	public void message(JLabel text)
	{
		JOptionPane.showMessageDialog(null, text);
	}
	public void message(String s)
	{
		ImageIcon icon = new ImageIcon("smiley.jpg");
		JOptionPane.showMessageDialog(null, s,"",JOptionPane.PLAIN_MESSAGE,icon);
	}
}

	