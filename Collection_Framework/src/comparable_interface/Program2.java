package comparable_interface;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class Program2 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<> ();
		l1.add(12); l1.add(18); l1.add(15);
		l1.add(17); l1.add(23);
		System.out.println(l1);
		for(Integer x : l1) {
			System.out.println(x);
		}
		System.out.println("===========after sorting===========");
		Collections.sort(l1);
		System.out.println(l1);
		for(Integer x : l1) {
			System.out.println(x);
		}
		
		
	}

}
