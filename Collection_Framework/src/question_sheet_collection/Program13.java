package question_sheet_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program13 {
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
		printFrequency(l1);
	}
	
	public static void printFrequency(List<Integer> l) {
		Set<Integer> s = new HashSet<>(l);
			for(int s1 : s) {
				int count =0;
				for(int p : l) {
					if(p==s1)
						count++;
				}
				
				System.out.println(s1 + " is : " + count + " times");
			}
		
		
	} 

}
