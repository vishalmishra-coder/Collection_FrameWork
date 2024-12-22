package map;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
public class Program5 {
	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<>();
		m1.put("vishal", 1); m1.put("baman", 2); 
		m1.put("pawan", 3);
		m1.put("shekhar", 4); m1.put("pandit", 5);
//		Run a loop on map values.
		Collection<Integer> c1 = m1.values();
		
		System.out.println("All values are : ");
		System.out.println("==========for each loop values()===========");
		for(int x: c1) {
			System.out.println(x);
		}
		
		
		System.out.println("==========for iterator()===========");
		Iterator <Integer> itr = c1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
