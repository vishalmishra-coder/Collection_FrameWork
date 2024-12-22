package comparator_interface;
import java.util.Comparator;
public class HighToLowSalary implements Comparator<Employ> {
	
	public int compare(Employ e1, Employ e2) {
		return (int)(e2.salary - e1.salary);
	}

}
