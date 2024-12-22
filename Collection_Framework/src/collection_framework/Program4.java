package collection_framework;
import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(12);
		c1.add(18);
		c1.add(13);
		c1.add(30);
		c1.add(21);
		c1.add(19);
		c1.add(15);
		System.out.println(c1);
		System.out.println("=================next Method==============");
//		divisible(c1);
		System.out.println("=================next Method==============");
//		getFactorial(c1);
		System.out.println("=================next Method==============");
		countNumber(c1);
		System.out.println("=================next Method==============");
		biggest(c1);
		System.out.println("=================next Method==============");
		sumNumber(c1);
		
		
	}
	
	public static void divisible(Collection c1) {
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
			int x = (Integer)itr.next();
			if(x%3==0)
				itr.remove();
		}
		System.out.println("Now c1 after divisble : " + c1);
		
	}
	
	public static void getFactorial(Collection c1) {
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
		int x = (Integer)itr.next();
		int fact =1;
		for(int i =1; i<=x; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial is : " + x +" =" + fact);
		
		}
	}
	
	public static void countNumber(Collection c1) {
		Iterator itr = c1.iterator();
		int count = 0;
		while(itr.hasNext()) {
			itr.next();
			count++;
			
		}
		System.out.println("Number of objects in collection is : " + count);
	}
	
	public static void biggest(Collection c1) {
		Iterator itr = c1.iterator();
		int big =0;
		while(itr.hasNext()) {
			int x =(Integer)itr.next();
			if(x>big) {
				big = x;
			}
		}
		System.out.println("Biggest Number is : " + big);
	}
	
	public static void sumNumber(Collection c1) {
		Iterator itr = c1.iterator();
		int sum = 0;
		while(itr.hasNext()) {
			Object x = itr.next();
			Integer y = (Integer)x;
			sum = sum + y;
			
		}
		System.out.println("Sum of Number is : " + sum);
	}

}
