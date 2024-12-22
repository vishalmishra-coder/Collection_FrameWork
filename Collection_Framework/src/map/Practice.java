package map;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
public class Practice {
	public static void main(String[] args) {
		int [] a = { 17 , 17 , 12 , 10 , 12 , 10 , 18 , 17};
		Map<Integer , Integer> m = printFrequency(a);
		System.out.println(m);
		Set<Map.Entry<Integer, Integer>> ens = m.entrySet();
		for(Map.Entry<Integer, Integer> p:ens) {
			if(p.getValue()%2==0)
			   System.out.println(p.getKey());
		}
	}
	public static Map<Integer , Integer> printFrequency(int[] a) {
		Map<Integer , Integer> m1 = new IdentityHashMap<>();
		for(int x: a) {
			if(m1.containsKey(x)) {
				m1.put(x, m1.get(x)+1);
			}
			else {
				m1.put(x, 1);
			}
		}
         return m1;
	}
}
