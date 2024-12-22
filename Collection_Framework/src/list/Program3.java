package list;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10); 
		l1.add(14);
		l1.add(21);
		l1.add(25);
		l1.add(29);
		System.out.println(l1.get(2));
		System.out.println(l1.get(3) + 25);
	}

}
