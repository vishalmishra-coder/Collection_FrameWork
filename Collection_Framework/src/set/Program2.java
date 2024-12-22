package set;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class Program2 {
	public static void main(String[] args)
	{
		List<Integer> l1 = new ArrayList<>();
		l1.add(10); l1.add(20); l1.add(20); l1.add(10);
		l1.add(30); l1.add(90); l1.add(30);
		removeDuplicate(l1);
		System.out.println("================================");
		Set<Integer> s = removeDuplicates( l1);
		System.out.println(s);
		
	}
	public static void removeDuplicate(List l1)
	{
		Set<Integer>s1 = new HashSet<>(l1);
		System.out.println(s1);
		
	}
	public static Set<Integer> removeDuplicates(List l1)
	{
		Set<Integer>s1 = new HashSet<>(l1);
		return s1;
		
	}

}
