package problemSet6;

import java.util.*;

public  class CompareOwner implements Comparator<Bicycle>{

	public int compare(Bicycle b1,Bicycle b2) {
		return b1.getOwner().compareToIgnoreCase(b2.getOwner());
	}

	
}
