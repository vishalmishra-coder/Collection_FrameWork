package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program3 {
	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.offer(39);
		q1.offer(54);
		q1.offer(34);
		q1.offer(47);
		q1.offer(57);
		q1.offer(89);
		System.out.println("Queue of q is : " + q1);
		System.out.println("Queue of q is : " + q1.peek());
		System.out.println("Queue of q is : " + q1);
		System.out.println("================================================");
		q1.clear();
		System.out.println("Queue of q is : " + q1.peek());
		System.out.println("Queue of q is : " + q1);
		
		System.out.println("================================================");
		q1.clear();
		System.out.println("Queue of q is : " + q1.element());
		System.out.println("Queue of q is : " + q1);
		
		
		
		
	}

}
