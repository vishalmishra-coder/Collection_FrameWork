package collection_framework;
import java.util.*;
public class Program5 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(12);
		c1.add(19); c1.add(20); c1.add(24); c1.add("sohan");
		c1.add(43); c1.add("mohan"); c1.add(20.45);
		System.out.println(c1);
		System.out.println("==========1st ques==============");
//		removeOdd(c1);
		System.out.println("==========2nd ques==============");
//		removeString(c1);
		System.out.println("==========3rd ques==============");
//		removeExceptString(c1);
		System.out.println("==========4th ques==============");
//		removeInteger(c1);
		System.out.println("==========5th ques==============");
//		removeExceptInteger(c1);
		System.out.println("==========6th ques==============");
//		countInteger(c1);
//		System.out.println("==========7th ques==============");
//		countEvenInteger(c1);
		System.out.println("==========7th ques==============");
//		sumInteger(c1);
		System.out.println("==========8th ques==============");
//		sumEvenInteger(c1);
		System.out.println("==========9th ques==============");
		biggestSmallest(c1);
	}
	
	public static void removeOdd(Collection c) {
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer && (Integer)o%2==1) {
				itr.remove();
			}
		}
		System.out.println("Now c is : " + c);
	}
	
	public static void removeString(Collection c) {
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof String) {
				itr.remove();
			}
		}
		System.out.println("Now c is : " +  c);
	}
	
	public static void removeExceptString(Collection c) {
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(!(o instanceof String)) {
				itr.remove();
				
			}
		}
		System.out.println("Now c is : " + c);
	}
	
	public static void removeInteger(Collection c) {
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer) {
				itr.remove();
			}
		}
		System.out.println(" Now c is : " + c);
	}
	
	public static void removeExceptInteger(Collection c) {
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(!(o instanceof Integer)) {
				itr.remove();
			}
		}
		System.out.println("Now c is : " + c);
	}
	
	public static void countInteger(Collection c) {
		System.out.println("Collection is:");
		System.out.println(c);
		int count=0;
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer)
				count++;
		}
		System.out.println("Total Integer Elements are: "+count);
	}
	
	
	public static void countEvenInteger(Collection c) {
		Iterator itr = c.iterator();
		int count=0;
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer && (Integer)o%2==0) {
				count++;
			}
		}
		System.out.println("Even count of c is : " + count);
		
	}
	
	public static void sumInteger(Collection c) {
		Iterator itr = c.iterator();
		int sum =0;
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer) {
				sum = sum + (Integer)o;
			}
		}
		System.out.println("Sum of c is : " + sum);
		
	}
	
	public static void sumEvenInteger(Collection c) {
		Iterator itr = c.iterator();
		int sum =0;
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer && (Integer)o%2==0) {
				sum = sum + (Integer)o;
			}
		}
		System.out.println("Sum of c even is : " + sum);
	}
	
	public static void biggestSmallest(Collection c) {
		Iterator itr = c.iterator();
		int big = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer) {
				int i = (Integer)o;
				if(i>big)
					big = i;
				if(i<small)
					small = i;
			}
		}
		System.out.println("Biggest in c : " + big);
		System.out.println("Smallest in c : " + small);
	}

}
