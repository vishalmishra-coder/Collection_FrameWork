package question_sheet_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program6 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList<>();
		c1.add("Shyam");
		c1.add(10);
		c1.add(10.34);
		c1.add("Man");
		c1.add(25);
		c1.add(29.43);
		c1.add("Sohana");
		c1.add(9);
		c1.add(24);
		c1.add(67);

		Iterator itr = c1.iterator();
        String largest = " "; String smallest = " ";
		System.out.println("Length of String is : ");
		while (itr.hasNext()) {
			Object o = itr.next();
			if (o instanceof String) {
				String s = (String) o;
				int length = s.length();
			    System.out.println(s + " = " + length + " ");
			}
		}
		
	}

}
