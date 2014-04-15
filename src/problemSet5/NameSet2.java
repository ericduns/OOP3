package problemSet5;

import java.util.*;
import javax.swing.*;
/** demonstrates Set and SortedSet via a list of names
 */
public class NameSet2 {
  public static void main (String args[]){
	  
	
  	Set<String> names = new HashSet<String>();
  	names.add("Bernadine");
  	names.add("Elizabeth");
  	names.add("Gene");
  	names.add("Elizabeth");
  	names.add("Clara");
  	message("List of names\n" + names);
  	
  	Set<String> friends = new HashSet();
	friends.add("Mike");
	friends.add("Paul");
	friends.add("Sarah");
	friends.add("Keira");
	friends.add("Chloe");
	Set<String> friends2 = new TreeSet();
	
	message("Friends list\n" + friends);
	message("Are all the names in the list\n" + friends.containsAll(friends2));
	
  	// transfer all the names to a (sorted) TreeSet
  	TreeSet<String> sortedNames = new TreeSet<String>(names);
  	message("Sorted names\n" + sortedNames);
  	message("First person is\n" +sortedNames.first());
  	int num = friends.size() + names.size() + 1 ;
  	message("You have " + num + " friends");
  	friends.removeAll(friends);
  	message("Friends After removing\n All the elements\n" + friends);
	
  	String name = JOptionPane.showInputDialog(null,"Enter a name to search");
  	
  	if(names.contains(name)){
  		message("The name is in the list ");
  	}
  	else {
  		  message("The name is not in the list ");
  		 }
  }

  public static void message(Set s){
	  JOptionPane.showMessageDialog(null,s);
  }
  public static void message(String s){
	  JOptionPane.showMessageDialog(null,s);
  }
}