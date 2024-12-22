package set;
import java.util.HashSet;
import java.util.Set;

public class Program4 {
	public static void main(String[] args)
	{
		int [] a= {12,18,12,18,20,18,12,30};
		printFrequency(a);
	}
	public static void printFrequency(int[] a)
	{
		Set<Integer> s1 = new HashSet<>();
		for(int x : a) {
			s1.add(x);
		}
		for(int x : s1)
		{
			int count =0;
			 for(int p : a) {
				 if(x==p)
					 count++;
			 }
			 System.out.println("Count of " + x + " is " + count + " times");
		 }	
	}
}
