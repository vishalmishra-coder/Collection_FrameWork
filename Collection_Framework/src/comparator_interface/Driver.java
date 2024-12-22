package comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<Employ> l1 = new ArrayList<>();
		Employ e1 = new Employ("Vishal" , 203 , 239382 , 21);
		l1.add(e1);
		l1.add(new Employ("Pawan" , 108 , 250000 , 25));
		l1.add(new Employ("Bhawan", 107 , 280000 , 23));
		l1.add(new Employ("Suraj" , 110 , 250000 , 27));
		l1.add(new Employ("Pawan" , 103 , 210000 , 23));
		l1.add(new Employ("Pawan" , 105 , 250000 , 29));
		l1.add(new Employ("Salman", 120 , 230000 , 23));
		l1.add(new Employ("Sunny" , 121 , 240000 , 22));
		l1.add(new Employ("Pawan" , 123 , 270000 , 23));
		l1.add(new Employ("Thars"  , 111 , 250000 , 21));
		System.out.println("==============All Employees============");
		for(Employ e :l1) {
			System.out.println(e);
		}
		
		Collections.sort(l1,new NameComparator());
		System.out.println("==============All Employees Sorted with Name============");
		for(Employ e :l1) {
			System.out.println(e);
		}
		
		
		Collections.sort(l1,new IdComparator());
		System.out.println("==============All Employees Sorted with ID============");
		for(Employ e :l1) {
			System.out.println(e);
		}
		
		Collections.sort(l1 , new LowToHighSalary());
		System.out.println("==============All Employees Sorted with low to high Salary============");
		for(Employ e :l1) {
			System.out.println(e);
		}
		
		Collections.sort(l1 , new HighToLowSalary());
		System.out.println("==============All Employees Sorted with high to low Salary============");
		for(Employ e :l1) {
			System.out.println(e);
		}
		
		
		Collections.sort(l1 , new LowToHighAgeComparator());
		System.out.println("==============All Employees Sorted with low to high  Age============");
		for(Employ e :l1) {
			System.out.println(e);
		}
		
		Collections.sort(l1 , new HighToLowAgeComparator());
		System.out.println("==============All Employees Sorted with  high to lowuy  Age============");
		for(Employ e :l1) {
			System.out.println(e);
		}
	}

}
