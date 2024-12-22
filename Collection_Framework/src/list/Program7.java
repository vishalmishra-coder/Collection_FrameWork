package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program7 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(20); l1.add(21); l1.add(17);
		l1.add(29); l1.add(23); l1.add(25);
		
		System.out.println(l1);
		
		ListIterator lit = l1.listIterator(l1.size());
		System.out.println("=========Backward iteration==========");
		while(lit.hasPrevious()) {
			Object o = lit.previous();
			System.out.print(o + " ");
		}
		
	}

}
