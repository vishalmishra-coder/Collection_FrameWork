package list;

import java.util.Vector;

public class Program11 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add("Mohan");
		v1.add(10);
		v1.add(30); v1.add(17); v1.add(87);
		System.out.println(v1.capacity());
		System.out.println(v1.elementAt(3));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
//		v1.removeAllElements();
		v1.set(1, 19);
		System.out.println(v1);
		v1.insertElementAt(37, 4);
		System.out.println(v1);
	}
	

}
