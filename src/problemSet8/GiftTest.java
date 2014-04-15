package problemSet8;

import java.awt.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;


public class GiftTest {

	public static void main(String[] args) {

		Map <String ,Gift> g = new TreeMap<String,Gift>();
		Gift gift ;
		
		g.put("Chloe",gift = new Gift("Chloe","TV",423.56));		
		g.put("Mary",gift = new Gift("Mary","DVD",120.56));		
		g.put("Caroline",gift = new Gift("Caroline","Ring",412.56));	
		g.put("Keira", gift = new Gift("Keira","Earings",123.56));
		g.put("Shauna", gift = new Gift("Shauna","Guitar",823.56));
		g.put("Keira", gift = new Gift("Sarah","Drums",123.56));



		HashSet<Gift> ls = new HashSet<Gift>(g.values());

		for(Gift a: ls)
		{
			System.out.print(a.getName() + " " );
		}

		Set<Map.Entry<String,Gift>> giftmap = g.entrySet();
		Iterator<Map.Entry<String,Gift>>it = giftmap.iterator();
		while(it.hasNext())
		{
			Map.Entry entry = it.next();
			System.out.print(entry + "\n");
		}
		String name = JOptionPane.showInputDialog("Enter the persons Name ");

		if(g.containsKey(name))
			JOptionPane.showMessageDialog(null,g.get(name));
	else
	    JOptionPane.showMessageDialog(null,"no matching values");
		System.out.println();
		Set<Map.Entry<String,Gift>> names = g.entrySet();
		Iterator<Map.Entry<String,Gift>>it2 = names.iterator();
		while(it2.hasNext())
		{
			Map.Entry entry = it2.next();
			System.out.print(entry.getKey() + " ");
		}
	}
}
