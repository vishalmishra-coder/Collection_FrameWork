package question_sheet_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program12 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(19);
		l1.add(17);
		l1.add(19);
		l1.add(29);
		l1.add(19);
		l1.add(29);
		l1.add(18);
		l1.add(17);
		l1.add(17);
		System.out.println(l1);
		removeDuplicates(l1);
	}
	public static void removeDuplicates(List<Integer> l) {
		Set<Integer> s = new HashSet<>(l);
		System.out.println("All Unique Elemnets are : ");
		for(Integer s1 : s)
			System.out.print(s1 + " ");
		
	}

}
