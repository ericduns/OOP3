package problemSet6;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class ReadText {

	public static void main(String [] args)
	{
		int i=0;
		String file = "",located = "",line="";
		File inFile = new File("example.txt");
		
		try{
			Scanner in = new Scanner(inFile);
		
			Set<String> details = new TreeSet<String>();

			while(in.hasNextLine())
				{
					file = in.nextLine();
					details.add(file);
				}
				System.out.println(details);
				
			}
			catch(FileNotFoundException e)
			{
				e.getMessage();
			}
		}
	
		
}
