package problemSet6;

import java.util.*;
/** demonstrates Set and SortedSet via a list of names
 */
public class NameSet {
  public static void main (String args[]){
	
	String longest="";
	int i=0;
	
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
  	
  	
  	String display = "",display2 = "";
  	Iterator<String> it = sortedNames.iterator();
  	while(it.hasNext())
  	{ 
  		display += it.next() + " ";	
  		
  		if(i == 0)
  			
  		 longest = display;
		  
  		else if(longest.length() > display.length())
		  {
			  longest = display;
		  }
  		i++;
	  }
  	
  	Iterator<String> it2 = sortedNames.iterator();
  	while(it2.hasNext())
	  	{
			display2 += it2.next().toString().length() + " " ;
	  	}
		
  	System.out.println("Displayed names " + display +"and the length of the names " + display2 );
  	System.out.println("The longest name is "+ longest);
  	
  }
  
}