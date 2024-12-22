package list;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class Program8 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(13);
		l1.add(21);
		l1.add(17);
		l1.add(28);
		l1.add(11);
		l1.add(18);

		ListIterator lit = l1.listIterator();
		while (lit.hasNext()) {
			Object o = lit.next();
			if ((int) o % 2 == 0) {
				System.out.print(lit.nextIndex() + " ");// it return the nextindex value where cursor is available
				System.out.print(o + " ");
				System.out.println();
			}
		}

		System.out.println("===================================");

		ListIterator lit2 = l1.listIterator(l1.size());
		while (lit2.hasPrevious()) {
			Object o = lit2.previous();
			if ((int) o % 2 == 0) {
				System.out.print(lit2.previousIndex() + " ");// it return the previous index value where cursor is
																// available
				System.out.print(o + " ");
				System.out.println();
			}
		}

	}

}
