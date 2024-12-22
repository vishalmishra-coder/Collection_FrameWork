package collection_framework;
import java.util.*;

public class Program6 {
	
	public static void main(String[] args) {
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		l1.add(90);
		l1.add(0,25);
		l1.add(34); 
		l1.add(1,55);
		l1.add(2,20.5);
		l1.add(3,89);
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		l1.add(2,78);
		System.out.println(l1);
		l1.remove(3);
		l1.add(21);
		System.out.println(l1);
		l2.add(35);
		l2.add(0,45);
		l1.addAll(2 ,l2);
		System.out.println(l1);
		
	}
	
	
	
	

}
