package list;

import java.util.ArrayList;
import java.util.Collection;

public class Program10 {
	public static void main(String[] args) {
		Collection<Integer> a1 = new ArrayList<>();
		a1.add(30); a1.add(21); a1.add(30); a1.add(40);
		a1.add(27);
		int sum =0;
		for(int x : a1)
			sum = sum + x;
		
		System.out.println("Sum is : " + sum);
		
		ArrayList<Integer> a2 =new ArrayList<>(a1);
		System.out.println(a2);
		
	}

}
