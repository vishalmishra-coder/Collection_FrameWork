package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program10 {
//	check the given string is palindrome or not by deque
	public static void main(String[] args) {
		String s1 = "Madam";
		s1 = s1.toLowerCase();
		if(checkPalindrome(s1)) 
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
			
		
	}
	
	public static boolean checkPalindrome(String s) {
		Deque <Character> dq = new ArrayDeque<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			dq.addLast(c);
		}
//		System.out.println(dq);
		while(dq.size()>1) {
			
			if((dq.removeFirst()!=dq.removeLast())) {
				return false;
			}
		}
		return true;
	
	
	}
	}


