package list;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10); 
		l1.add(14);
		l1.add(21);
		l1.add(25);
		l1.add(29);
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
	}

}
