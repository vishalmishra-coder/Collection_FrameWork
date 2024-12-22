package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program6 {
	public static void main(String[] args ) {
		int[] a = {2 , 2,2,2,2,2};
		twoSmallest(a);
		
	}
	public static void twoSmallest(int [] a) {
		Queue<Integer> q1 = new PriorityQueue<>();
		for(int x : a) {
			q1.offer(x);
		}
		int smallest = q1.poll();
		int second_smallest = smallest;
		while(!q1.isEmpty()) {
			int temp = q1.poll();
			if(temp!=second_smallest) {
				second_smallest = temp;
				break;
			}
		}
		System.out.println("Smallest is : " + smallest);
		System.out.println("Second Smallest is : " + second_smallest);
	}

}
