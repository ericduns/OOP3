package problemSet8;

import java.util.*;

/** uses a map to hold details of subject codes and subject titles 
 @author Wu
 **/
public class SubjectCatalog {
	public static void main (String args[]){
		// declare a map with String keys and String values
		Map <String,String>    catalog;
		// create this map as a sorted TreeMap implementation
		catalog = new TreeMap<String,String>( );
		// add a number of entries to the map
		catalog.put("CS101", "Intro Java Programming");
		catalog.put("CS301", "Database Design");
		catalog.put("CS413", "Software Design for Mobile Devices");
		// check whether the map contains a particular key
		if (catalog.containsKey("CS101")) {
			System.out.println("We teach Java this semester");
		} 
		else {
			System.out.println("No Java courses this semester");
		}
		Map <String , String> catalog2;

		catalog2 = new TreeMap<String , String>();
		catalog2.put("Bs101", "Introduction to Accounting");
		catalog2.put("Bs201", "Intermediate Accounting");
		catalog2.put("Bs301", "Advanced Accounting");

		Map <String,String> allCourses;
		allCourses = new TreeMap<String,String>();

		allCourses.putAll(catalog);
		allCourses.putAll(catalog2);


		System.out.println("Combined Cources " + allCourses);

		Set <Map.Entry<String,String>> subject = allCourses.entrySet();


		Set<String> CourseCode = new HashSet<String>();


		Iterator<Map.Entry<String,String>> it = subject.iterator();
		while ( it.hasNext() ) {
	    	Map.Entry<String,String> sAndSEntry = (Map.Entry<String,String>) it.next();
	    	String theme = sAndSEntry.getKey();

	    	if (theme.startsWith("Bs")) {

	    		CourseCode.add(sAndSEntry.getValue());
	        } 
		}



		System.out.println("Removed Courses " + CourseCode);


	}
}