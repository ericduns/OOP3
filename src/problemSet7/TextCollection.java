package problemSet7;

import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;


public class TextCollection extends JFrame implements ActionListener{
	
	JTextArea area;
	JButton btn_Collect;
	String allWords ="",wordsInOrder="";
	public TextCollection()
	{
		super("Collecting text from a text area");
		setLayout(new FlowLayout());
		setSize(300,300);
		setLocation(300,300);
		area = new JTextArea(10,30);
		area.setFont(new Font("monospaced",Font.ITALIC,12));
		add(area);
		btn_Collect = new JButton("Collect Text");
		btn_Collect.addActionListener(this);
		add(btn_Collect);
		
		
	}
	

	public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable(){
			
				public void run() {
					TextCollection collect = new TextCollection();
					collect.setDefaultCloseOperation(EXIT_ON_CLOSE);
					collect.setVisible(true);
				}
			});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_Collect)
		{
			
			String [] text = area.getText().split(" ");
		
			area.setText("");
			Collection<String> words = Arrays.asList(text);
			
			Set<String> noRepeates = new HashSet<String>(words);
			
			JOptionPane.showMessageDialog(null, "\nThere are " + noRepeates.size() + " words ");
			
			Iterator<String> it = noRepeates.iterator();
			while(it.hasNext())
			{
				allWords += it.next() + "\n";
				
			}
			JOptionPane.showMessageDialog(null,"\nList of Words");
			JOptionPane.showMessageDialog(null, "\n" + allWords);
		
			Set<String> inOrder = new TreeSet<String>(noRepeates);
			
			Iterator<String> it2 = inOrder.iterator();
			while(it2.hasNext())
			{
				wordsInOrder += it2.next() + "\n";
				
			}
			JOptionPane.showMessageDialog(null,"\nWords in order");
			JOptionPane.showMessageDialog(null, "\n" + wordsInOrder + "\nThe first Word " + ((TreeSet<String>) inOrder).first()+
												"\nThe last Word " + ((TreeSet<String>) inOrder).last());
			
			
		}
		
	}

}
