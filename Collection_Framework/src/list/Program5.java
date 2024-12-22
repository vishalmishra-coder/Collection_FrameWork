package list;

import java.util.ArrayList;
import java.util.List;

public class Program5 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10); 
		l1.add(14);
		l1.add(21);
		l1.add(14);
		l1.add(29);
		System.out.println(l1.indexOf(14));
		System.out.println(l1.indexOf(21));
		System.out.println(l1.indexOf(28));
		System.out.println(l1.lastIndexOf(14));
	}

}
