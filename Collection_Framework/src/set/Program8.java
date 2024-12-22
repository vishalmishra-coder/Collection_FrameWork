package set;

import java.util.Set;
import java.util.TreeSet;

public class Program8 {
	public static void main(String[] args) {
		String s = "aaab cdcd nhbnol";
		printFreq(s);
		
	}
	public static void printFreq(String s) {
		Set<Character> s1 = new TreeSet<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c!=' ')
			  s1.add(c);
		}
		
		for(char c : s1) {
			int count =0;
			for(int i=0; i<s.length(); i++) {
				if(c == s.charAt(i)) {
					count++;
				}
			}
			System.out.println(c + " is : " + count + " times");
		}
		
		
	}
	

}
