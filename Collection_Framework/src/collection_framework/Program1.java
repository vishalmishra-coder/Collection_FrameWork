package collection_framework;
import java.util.*;
public class Program1 {
	public static void main(String[] args)
	{
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		System.out.println(c1);
		c1.add(24);
		c1.add(40);
		c1.add("mohan");
		System.out.println(c1.add("sohan"));
		System.out.println(c1);
		c1.add('@');
		c1.add(40);
		c1.add(23.45);
		System.out.println(c1);
		c2.add(100);
		c2.add(200);
		c2.add(400);
		System.out.println(" c1 is : " + c1);
		System.out.println(" c2 is : " + c2);
		System.out.println("====================addAll===============================");
		c1.addAll(c2);
		System.out.println(c1);
		System.out.println("=====================remove==============================");
		c1.remove(40);
		System.out.println(c1);
		System.out.println("=====================removeAll===========================");
//		c1.removeAll(c2);
		System.out.println(c1);
		
		System.out.println("=====================retainAll===========================");
		c1.retainAll(c2);
		System.out.println(c1);
		
		System.out.println("======================clear============================");
		c1.clear();
		System.out.println(c1);	
	}
}
