package queue;
import java.util.Queue;
import java.util.PriorityQueue;
public class Program1 {
	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.offer(10); q1.offer(23);
		q1.offer(19);
		q1.offer(5); q1.offer(27);
		q1.offer(29);
		System.out.println("Queue is : " + q1);	
		
	}

}
