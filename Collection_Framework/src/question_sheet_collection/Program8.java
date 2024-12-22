package question_sheet_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program8 {
	public static void main(String[] args) {
		Collection <Integer> c1 = new ArrayList<>();
		c1.add(101);
		c1.add(99);
		c1.add(1000);
		c1.add(828);
		c1.add(345);
		c1.add(867);
		c1.add(265);
		c1.add(2000);
		int count =0;
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if((int)o>=100 && (int)o<=999) {
				System.out.println(o);
				count++;
			}
		}
		System.out.println("Count of a Number is : " + count);
	}

}
