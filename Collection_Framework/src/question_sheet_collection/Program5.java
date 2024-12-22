package question_sheet_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program5 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList<>();
		c1.add("Shyam"); c1.add(10); c1.add(10.34);
		c1.add("Mohan"); c1.add(25); c1.add(29.43);
		c1.add("Sohan");c1.add(9); c1.add(24);c1.add(67);
		
		Iterator itr = c1.iterator();
		int largest = Integer.MIN_VALUE;   int smallest = Integer.MAX_VALUE;
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer) {
				if((int)o>largest) {
					
					largest = (int)o;
				}
				if((int)o<smallest) {
					smallest = (int)o;
				}
			}
		}
		System.out.println("Largest is : " + largest);
		System.out.println("Smallest is : " + smallest);
	}

}
