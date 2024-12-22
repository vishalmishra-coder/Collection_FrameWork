package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program2 {
	public static void main(String[] args) {
		Map<String , Integer> m1 = new HashMap<>();
		Map<String , Integer> m2 = new HashMap<>();
		m1.put("Mohan", 1); m1.put("Mohan", 8);
		m1.put("Sohan", 2); m1.put("Rohan", 9);
		m2.put("Kiran", 5); m2.put("Mahi", null);
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println(m1.isEmpty());
		System.out.println("=====contains==========");
		System.out.println(m1.containsKey("Rohan"));
		System.out.println("===============");
		System.out.println(m1.containsValue(1));
		System.out.println("========get=======");
		System.out.println(m1.get("Sohan"));
		System.out.println("========remove=======");
		System.out.println(m1.remove("Rohan"));
		System.out.println(m1);
		System.out.println("========putAll=======");
		m2.putAll(m1);
		System.out.println(m2);
		System.out.println("========clear=======");
//		m2.clear();
		System.out.println(m2);
		System.out.println("========keySet=======");
		Set<String> s = m2.keySet();
		System.out.println(s);
		System.out.println("========value=======");
		Collection<Integer> c = m2.values();
		System.out.println(c);
		System.out.println("========entrySet=======");
		Set<Map.Entry<String, Integer>> es = m2.entrySet();
		System.out.println(es);	
	}

}
