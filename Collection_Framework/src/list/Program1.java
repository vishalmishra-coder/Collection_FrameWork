package list;
import java.util.List;
import java.util.ArrayList;
public class Program1 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10); l1.add(1,50); l1.add(0,55);
		
		l1.remove(1);
		l1.add(45);
		l1.add(1,100);
		l1.remove(2);
		l1.add(2,70);
		l1.remove(1);
		
		System.out.println(l1);
	}

}
