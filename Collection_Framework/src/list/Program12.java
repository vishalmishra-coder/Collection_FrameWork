package list;
import java.util.Stack;
public class Program12 {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.push(10); 
		s1.push(40);
		s1.push(100);
		s1.push(66);
		s1.push(40);
		s1.push(48);
		s1.push(90);
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.search(40));
		System.out.println(s1.search(90));
		System.out.println(s1.search(1000));
		
	}

}
