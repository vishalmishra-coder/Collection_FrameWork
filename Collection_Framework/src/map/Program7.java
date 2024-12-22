package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Program7 {
	public static void main(String[] args) {
		String s1 = "abbc dde faaa";
		printCharacterFrequency(s1);
	}
	
	public static void printCharacterFrequency(String s1) {
		Map<Character , Integer> m1 = new HashMap<>();
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(c!=' ') {
				
			
			if(!m1.containsKey(c)) {
				m1.put(c, 1);
			}
			else {
				m1.put(c , m1.get(c)+1);
			}
			
			}
		}
		Set<Map.Entry<Character , Integer>> es = m1.entrySet();
		for(Map.Entry<Character, Integer> p: es) {
			System.out.println(p.getKey() + " is : " + p.getValue() + " times");
		}
		
	}

}
