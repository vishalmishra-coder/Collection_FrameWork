package question_sheet_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program11 {
	public static boolean isPalindrome(int n) {
		int original = n;
		int rev = 0;
		while(n>0) {
			int rem = n%10;
			rev = 10*rev + rem;
			n= n/10;
		}
		return rev==original;
	}
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(121);
		c1.add(223); 
		c1.add(111);
		c1.add(131); 
		c1.add(237);
		Iterator itr = c1.iterator();
		int count =0;
		while(itr.hasNext()) {
			Object o = itr.next();
			if(isPalindrome((int)o)) {
				System.out.println(o);
				count++;
			}
			}
		System.out.println("All Palindrome Number Count is : " + count);
		}
		
	}


