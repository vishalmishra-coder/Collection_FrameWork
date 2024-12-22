package set;
import java.util.Set;
import java.util.HashSet;

public class Program1 {
	public static void main(String[] args)
	{
		int[] a = {10 , 20 , 30 , 30, 40 , 40 , 50 , 60 , 70};
		removeDuplicate(a);
	}
	public static void removeDuplicate(int[] a)
	{
		Set<Integer> s1 = new HashSet();
		for(int x : a)
		{
			s1.add(x);
		}
		System.out.println("All unique elements are : " + s1);
	}
	

}
