package problemSet4;

/*ITTClubs2.java*/
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

public class ITTClubs2 extends MouseAdapter {
	JList list;
	String club;
	int intRemoveItem;
	Set<String> clubs;
	Container pane;

     public static void main(String[] args)
    {
       ITTClubs2 gui = new ITTClubs2();

    }

    public ITTClubs2()
    {
    	clubs = new HashSet<String>();
		int confirm = JOptionPane.YES_OPTION;


		JFrame frame = new JFrame();

		//super("");
		frame.setSize(300,200);



		pane = frame.getContentPane();
		pane.setBackground(Color.BLUE);
		pane.setLayout(new FlowLayout());



	while(confirm == JOptionPane.YES_OPTION)
		{
			club = JOptionPane.showInputDialog("Enter the club name");
			clubs.add(club);

			confirm = JOptionPane.showConfirmDialog(null,"Do you want to enter more clubs", "Enter Clubs", JOptionPane.YES_NO_OPTION);
		}



		TreeSet<String> orgClubs = new TreeSet<String>(clubs);

		list = new JList(orgClubs.toArray());

		list.addMouseListener(this);
		pane.add(list);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }

	public void mouseClicked(MouseEvent e)
	{
		intRemoveItem = list.getSelectedIndex();
		System.out.print(intRemoveItem);
		list.remove(intRemoveItem);

	}



}