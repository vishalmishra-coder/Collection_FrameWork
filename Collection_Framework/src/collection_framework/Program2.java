package collection_framework;
import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		c1.add(12);
		c1.add(18);
		c1.add(15);
		c1.add(12);
		c1.add(20);
		c1.add(17);
		System.out.println(c1.contains(18));
		c2.add(12);
		c2.add(15);
		c2.add(18);
		System.out.println("===============containsAll===============");
		System.out.println(c1.containsAll(c2));
		
//		other methods
		System.out.println("=================size()=================");
		System.out.println(c1.size());
		
		System.out.println("===========isEmpty()=============");
		System.out.println(c1.isEmpty());
		System.out.println("===============hashCode===========");
		System.out.println(c1.hashCode());
		
		System.out.println("===============toArray================");
		Object[] x = c1.toArray();
		for(Object p :x)
			System.out.print(p + " "); 
		System.out.println("\nArray is : " + Arrays.toString(x));
		
	}

}
