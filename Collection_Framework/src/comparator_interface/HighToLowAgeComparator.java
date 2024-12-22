package comparator_interface;
import java.util.Comparator;
public class HighToLowAgeComparator implements Comparator<Employ>{
	
	public int compare(Employ e1 , Employ e2) {
		return e2.age - e1.age;
	}

}
