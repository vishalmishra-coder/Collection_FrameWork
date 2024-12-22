package list;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class Program9 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(30); l1.add(32); l1.add(40); l1.add(45);
		l1.add(32); l1.add(43); l1.add(20);
		
		System.out.println(l1);
		l1.set(4,31);//It will replace or set the value at given index.
		System.out.println(l1);
		System.out.println("=========================================");
		ListIterator lit = l1.listIterator();
		lit.next();
		lit.set(67);  //it will replace the value at current position of cursor
		System.out.println(l1);
		System.out.println("=========================================");
		ListIterator lit1 = l1.listIterator();
		lit1.add(87);  //it will add the value at current position of cursor
		System.out.println(l1);
		
		
		
	}

}
