package map;

import java.util.HashMap;
import java.util.Map;

public class Program3 {
	public static void main(String[] args) {
		Map<Integer , Integer> m1 = new HashMap<>();
		Map<Integer , Integer> m2 = new HashMap<>();
		m1.put(1,1); m1.put(2, 10); m1.put(3, 11);
		m2.put(1,1); m2.put(2, 10); m2.put(3, 12);
		System.out.println("==========equals()=========");
		System.out.println(m1.equals(m2));
		System.out.println("==========putIfAbsent()=========");
		m1.putIfAbsent(4, 8);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println("==========remove()=========");
		System.out.println(m1.remove(2,10));
		System.out.println(m1);
		System.out.println("==========replace(key,old_value,new_value)=========");
		System.out.println(m1.replace(1 , 1 , 2));
		System.out.println(m1);
		System.out.println("==========replace(key,value)=========");
		System.out.println(m1.replace(1 , 3));
		System.out.println(m1);
		
		
		
		
	
		
	}

}
