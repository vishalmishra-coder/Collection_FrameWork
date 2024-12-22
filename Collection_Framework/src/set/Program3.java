package set;
import java.util.Set;
import java.util.HashSet;

public class Program3 {
	public static void main(String[] args)
	{
		int[] a = { 12 ,18 ,12, 18 ,20 , 18 , 12 , 30};
		System.out.print("All elements are : ");
		for (int p :a) {
			System.out.print(p + " ");
		}
		int[] b = removeDuplicates(a);
		System.out.print("\nAll Unique elements are : ");
		for (int p :b) {
			System.out.print(p + " ");
		}
	}
	public static int[] removeDuplicates(int[] a)
	{
		Set<Integer> s1 = new HashSet<>();
		for(int x : a)
		{
			s1.add(x);
		}
		int [] b = new int[s1.size()];
		int i =0;
		for(int x:s1) {
			b[i] = x;
			i++;
		}
		
		return b;
	}

}
