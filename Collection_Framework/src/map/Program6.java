package map;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class Program6 {
	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<>();
		m1.put("vishal", 1); m1.put("baman", 2); 
		m1.put("pawan", 3);
		m1.put("shekhar", 4); m1.put("pandit", 5);
//		Run a loop on map entries
		System.out.println("========for each loop()========");
		Set<Map.Entry<String,Integer>> es = m1.entrySet();
		for(Map.Entry<String,Integer> x : es) {
			System.out.println(x);
			
		}
		System.out.println("==========entry method()=========");
		for(Map.Entry<String, Integer> x : es) {
			System.out.println("Keys is : " + x.getKey() + " \tValue is : " + x.getValue());
		}
		
		
	}

}
