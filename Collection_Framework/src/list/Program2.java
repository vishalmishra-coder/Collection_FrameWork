package list;
import java.util.List;
import java.util.ArrayList;
public class Program2 {
	public static void main(String[] args) {
		List l1 = new ArrayList<>();
		l1.add(10); 
		l1.add(14);
		l1.add(21);
		l1.add(25);
		l1.add(29);
		System.out.println(l1.get(2));
		System.out.println((int)l1.get(3) + 25);
	}

}
