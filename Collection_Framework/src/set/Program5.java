package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program5 {
	public static void main(String[] args) {
		List <Integer> l1 = new ArrayList<>();
		l1.add(12); l1.add(18); l1.add(12); l1.add(18); l1.add(20); l1.add(18);
		l1.add(12); l1.add(30);
		printFrequency(l1);
	}
	public static void printFrequency(List l1) {
		Set<Integer> s1 = new HashSet<>(l1);
		for(int x : s1) {
			int count=0;
			for(int i =0; i<l1.size(); i++) {
				if(x==(int)l1.get(i)) {
					count++;
					l1.remove(i);
					i--;
					
				}
			}
			System.out.println("Count of " + x + " is " + count + " times");
		}
		
	}

}
