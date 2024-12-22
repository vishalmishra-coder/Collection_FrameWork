package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Program4 {
	public static void main(String[] args) {
		
		Map<String,Integer> m1 = new HashMap<>();
		m1.put("vishal", 1); m1.put("baman", 2); 
		m1.put("pawan", 3);
		m1.put("shekhar", 4); m1.put("pandit", 5);
//		Run a loop on Map keys .
		Set<String> s1 = m1.keySet();
//		For each loop
		System.out.println("==========for each===============");
		System.out.println("All Keys Are :");
		for(String x : s1) {
			System.out.println(x);
		}
		
		System.out.println("=========iterator()=========");
//		By iterator method
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
	}

}
