package question_sheet_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList<>();
		c1.add("Shyam"); c1.add(10); c1.add(10.34);
		c1.add("Mohan"); c1.add(25); c1.add(29.43);
		c1.add("Sohan");
		
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer) {
				System.out.print(o + " ");
			}
		}
		
	}

}
