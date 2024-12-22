package comparator_interface;

import java.util.Comparator;

public class NameComparator implements Comparator<Employ>{
	
		public int compare(Employ e1 , Employ e2) {
			return e1.name.compareToIgnoreCase(e2.name);
		}
}
