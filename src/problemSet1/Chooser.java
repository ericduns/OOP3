package problemSet1;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.text.*;

public class Chooser{
	
	public static void main(String [] args)
		{
			JColorChooser chooser = new JColorChooser();
			
			Color color1 = JColorChooser.showDialog(chooser,"Set the foreground color",chooser.getColor());
			Color color2 = JColorChooser.showDialog(chooser,"Set the Background color",chooser.getColor());
			
			JTextArea area = new JTextArea(20,20);
			area.setFont(new Font("monospaced",Font.PLAIN,16));
			area.setForeground(color1);
			area.setBackground(color2);
			area.setText("Your Color Choices");
			JOptionPane.showMessageDialog(null,area);
		}
}