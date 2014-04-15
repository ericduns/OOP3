package problemSet6;

import java.util.*;


public class Wrapper {

	public static void main(String[] args) {
		
		int total = 0,total2 = 0;
		
		Set<Integer> display = new HashSet<Integer>(); 
		
		for(int i =0;i < 20;i++)
		{
			display.add(new Integer(i));
		}
		Iterator<Integer> it = display.iterator();
		while(it.hasNext())
		{
			total += it.next().intValue();
		}
			System.out.println(total);
			display.remove(10);
			
			Iterator<Integer> it2 = display.iterator();
			while(it2.hasNext())
			{
				total2 += it2.next().intValue();
			}
			System.out.println(total2);
	}

}
