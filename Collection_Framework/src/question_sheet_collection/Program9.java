package question_sheet_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program9 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(100);
		c1.add(99);
		c1.add(101);
		c1.add(900);
		c1.add(856);
		c1.add(90);
		c1.add(91);
		Iterator itr = c1.iterator();
		int count =0;
		System.out.println("Even Numbers  in collection : ");
		while(itr.hasNext()) {
			Object o = itr.next();
			if((int)o%2==0) {
				System.out.println(o);
			count++;
			}
		}
		System.out.println("Even number count is : " + count);
	}

}
