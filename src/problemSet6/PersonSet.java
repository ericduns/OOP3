package problemSet6;

import java.util.*;
/** demonstrates Set and SortedSet via a list of persons
 * needs the Person class in the same folder*/

public class PersonSet {
  public static void main (String args[]){
  	Set<Person> friends = new HashSet<Person>();
  	Person person;
  	    person = new Person("Jane", 10, 'F');
        friends.add( person );

        person = new Person("Ed",  6, 'M');
        friends.add( person );

        person = new Person("William",  8, 'M');
        friends.add( person );

        person = new Person("Emma", 14, 'F');
        friends.add( person );


  	System.out.println(friends);

    Set<Person> sortedFriends = new TreeSet<Person>(friends);
    System.out.println(sortedFriends);  

  
  }
  }