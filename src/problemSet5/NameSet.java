package problemSet5;

import java.util.*;
import javax.swing.*;
/** demonstrates Set and SortedSet via a list of names
 */
public class NameSet {
  public static void main (String args[]){
	  
	
  	Set<String> names = new HashSet<String>();
  	names.add("Bernadine");
  	names.add("Elizabeth");
  	names.add("Gene");
  	names.add("Elizabeth");
  	names.add("Clara");
  	System.out.println(names);
  	
  	// transfer all the names to a (sorted) TreeSet
  	TreeSet<String> sortedNames = new TreeSet<String>(names);
  	System.out.println(sortedNames);
  	System.out.println("First person is " +sortedNames.first());
  	
  	String name = JOptionPane.showInputDialog(null,"Enter a name to search");
  	
  	if(names.contains(name)){
  		message("The name is in the list ");
  	}
  	else {
  		  message("The name is not in the list ");
  		 }
  }
  public static void message(String s){
	  JOptionPane.showMessageDialog(null,s);
  }
}