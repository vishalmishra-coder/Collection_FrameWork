package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program2 {
	public static void main(String[] args)
	{
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.offer(10);
		q1.offer(12);
		q1.offer(34);
		q1.offer(19);
		q1.offer(5);
		System.out.println("Head element of q1 is : " + q1.remove());
		System.out.println("Head element of q1 is : " + q1.poll());
		System.out.println("Head element of q1 is : " + q1.poll());
		System.out.println("Head element of q1 is : " + q1.poll());
		
		
	}

}
