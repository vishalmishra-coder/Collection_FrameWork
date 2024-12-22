package comparator_interface;
import java.util.Comparator;
public class LowToHighAgeComparator implements Comparator<Employ>{
	
	public int compare(Employ e1 , Employ e2) {
		return e1.age - e2.age;
	}

}
