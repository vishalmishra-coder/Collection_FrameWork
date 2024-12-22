package question_sheet_collection;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class Program7 {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>();
		c1.add("Mohan"); c1.add("Vishal");
		c1.add("Suraj Pan"); c1.add("Mangesh");
		c1.add("Ram"); c1.add("Abhay");
		largestSmallestString(c1);
	}
	
	public static void largestSmallestString(Collection<String> c) {
		TreeSet<String> s1 = new TreeSet<>(c);
		System.out.println("Largest String is : " + s1.first());
		System.out.println("Smallest String is : " + s1.last());
		
	}

}
