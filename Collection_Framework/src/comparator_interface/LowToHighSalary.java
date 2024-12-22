package comparator_interface;

import java.util.Comparator;

public class LowToHighSalary implements Comparator<Employ> {
	
	public int compare(Employ e1 , Employ e2) {
		return (int)(e1.salary - e2.salary);
	}
	

}
