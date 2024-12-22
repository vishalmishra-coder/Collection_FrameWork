package collection_framework;
import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add(31);
		c1.add(40); c1.add(43);
		c1.add(46);
		c1.add(89);
		System.out.println(c1);
		Iterator itr = c1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("================next method===================");
//		oddElementRemove(c1);
		System.out.println("================next method===================");
		evenElementRemove(c1);
		
		
		
		
	}
	
	public static void oddElementRemove(Collection c1) {
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
			int x = (Integer)itr.next();
			if(x%2==1)
				itr.remove();
			}
		System.out.println("Now after removing c1 is : " + c1);
	}
	
	public static void evenElementRemove(Collection c1) {
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
			int x = (Integer)itr.next();
			if(x%2==0)
				itr.remove();
		}
		System.out.println("Now after removing even c1 is : " + c1);
	}
	
	

}
