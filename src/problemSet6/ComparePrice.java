package problemSet6;

import java.util.Comparator;


public class ComparePrice implements Comparator<Bicycle>{

	@Override
	public int compare(Bicycle b1, Bicycle b2) {

		if(b1.getValue() > b2.getValue())

		return +1;
		else
			return -1;
	}

}
