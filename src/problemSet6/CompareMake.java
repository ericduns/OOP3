package problemSet6;

import java.util.Comparator;


public class CompareMake implements Comparator<Bicycle>{

	@Override
	public int compare(Bicycle b1, Bicycle b2) {

		return b1.getMake().compareToIgnoreCase(b2.getMake());
	}

	

}
