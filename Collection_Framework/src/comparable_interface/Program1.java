package comparable_interface;

import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
		int [] a = { 12, 18 , 30 , 15 , 17 , 23};
		System.out.println(a);
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("===========after sorting==========");
		System.out.println(Arrays.toString(a));
	}

}
