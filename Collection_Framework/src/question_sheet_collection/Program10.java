package question_sheet_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program10 {
	
	public static boolean isPrime(int n) {
		if(n <=1)
			return false;
		for(int i =2; i<=Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(17);
		c1.add(97);
		c1.add(101);
		c1.add(31);
		c1.add(856);
		c1.add(90);
		c1.add(91);
		Iterator itr = c1.iterator();
		int count =0;
		while(itr.hasNext()) {
			Object o = itr.next();
			if(isPrime((int)o)) {
				System.out.println(o);
				count++;
			}
			}
		System.out.println("All Prime Number Count is : " + count);
		}
		
	}


