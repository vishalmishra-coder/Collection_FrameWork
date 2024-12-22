package map;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;
public class Program1 {
	public static void main(String[] args) {
		int [] a = { 12 , 18 , 12 , 30 , 30 , 12 , 70 , 12 };
//		printFrequency(a);
		Map<Integer , Integer> m = printFrequency(a);
//		System.out.println("Map is : " + m);
		Set<Map.Entry<Integer,Integer>> es = m.entrySet();
		for(Map.Entry<Integer,Integer> p : es) {
			System.out.println(p.getKey() + " is : " + p.getValue() + " times");
		}	
	}
	public static Map printFrequency(int[] a) {
		Map<Integer , Integer> m1 = new HashMap<>();
		for(int x : a) {
			if(!m1.containsKey(x)) {
				m1.put(x , 1);
			}
			else {
				m1.put(x, m1.get(x)+1);
			}
		}
//		System.out.println("Map is : " + m1);
		return m1;
	}

}
