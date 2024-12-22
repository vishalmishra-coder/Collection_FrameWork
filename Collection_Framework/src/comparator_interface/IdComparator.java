package comparator_interface;

import java.util.Comparator;

public class IdComparator implements Comparator<Employ> {
	
	public int compare(Employ e1 , Employ e2) {
		return e1.id - e2.id;
	}

}
