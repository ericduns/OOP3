package problemSet6;

import java.util.*;
/** traverses a list using an iterator */
public class GenericFriendsList2 {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends;

        //Add members to a list
        friends = new ArrayList<Person>( );

        person = new Person("Jane", 10, 'F');
        friends.add( person );

        person = new Person("Jack",  6, 'M');
        friends.add( person );

        person = new Person("Jill",  8, 'F');
        friends.add( person );

        person = new Person("John", 14, 'M');
        friends.add( person );

        person = new Person("Mary", 21, 'F');
        friends.add( person );
        
        person = new Person("Keira", 6, 'F');
        friends.add( person );
        
        person = new Person("Mike", 32, 'M');
        friends.add( person );
        
        person = new Person("Sean", 12, 'M');
        friends.add( person );
        // display the list
        System.out.println("List of friends, using toString()" +friends);

        //display again, using an iterator this time
        System.out.println("\nNames of my friends, using iterator()");
        // Note the 'typed' Iterator
        Iterator<Person> it = friends.iterator();
		while (it.hasNext())
		{
			person = it.next();
			if(person.getGender() == 'M')
				it.remove();
		}
			System.out.println("All the girls in the list " + friends);
			
		/*	while (it.hasNext())
			{
				person = it.next();
				if(person.getGender() == 'F')
					it.remove();
			}
			System.out.println("All the guys in the list " + friends);*/
    }
}