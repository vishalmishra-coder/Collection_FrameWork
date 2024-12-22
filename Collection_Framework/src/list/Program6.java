package list;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class Program6 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(20); l1.add(21); l1.add(17);
		l1.add(29); l1.add(23); l1.add(25);
		
		System.out.println(l1);
		ListIterator lit = l1.listIterator();
		System.out.println("=========Forward iteration==========");
		while(lit.hasNext()) {
			Object o = lit.next();
			System.out.print(o + " ");
		}
		System.out.println("\n=========Backward iteration==========");
		while(lit.hasPrevious()) {
			Object o = lit.previous();
			System.out.print(o + " ");
		}
		
	}

}
