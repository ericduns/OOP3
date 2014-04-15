package problemSet6;

import java.util.*;
/** Sets up a list of people, and filters out all under 10 years old using an Iterator*/
public class FilteredFriendsList {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends;

        //Add members to a list
        friends = new ArrayList<Person>( );

        person = new Person("Bill", 10, 'F');
        friends.add( person );

        person = new Person("Alice",  6, 'M');
        friends.add( person );

        person = new Person("Emmeline",  8, 'F');
        friends.add( person );

        person = new Person("John", 14, 'M');
        friends.add( person );

        // display the list
        System.out.println("Original List: " +friends);

        //Remove the everyone aged less than 10
        //and display again: note the use of an Iterator
        Iterator<Person> it = friends.iterator();
	/*	while (it.hasNext()){
		  person = it.next();
			if (person.getAge() < 10)
				it.remove();
		}*/
		
		while (it.hasNext()){
			  person = it.next();
				if (person.getName().startsWith("J"))
					it.remove();
			}
		
     //   System.out.println("\nList with the under-10s removed");
        System.out.println("\nList without names that contain j");
        System.out.println(friends);
    }
}