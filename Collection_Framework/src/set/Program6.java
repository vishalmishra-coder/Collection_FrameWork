package set;

import java.util.Set;
import java.util.TreeSet;

public class Program6 {
	public static void main(String[] args) {
		String str = "Mohan aaa bcd Sohan";
		removeDuplicate(str);
	}
	public static void removeDuplicate(String str) {
		Set<Character> s1 = new TreeSet<>();
		for(int i=0; i<str.length(); i++) {
			char c= str.charAt(i);
			if(c != ' ')
				s1.add(c);
		}
		System.out.println(s1);
	}

}
