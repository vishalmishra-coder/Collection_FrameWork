package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program7 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(19); l1.add(17); l1.add(13); l1.add(21);
		l1.add(9);l1.add(9);
		smallestSecondSmallest(l1);
	}
	public static void smallestSecondSmallest(List<Integer>l1) {
		Queue<Integer> q1 = new PriorityQueue<>(l1);
		int smallest = q1.poll();
		int second_smallest = smallest;
		while(!q1.isEmpty()) {
			int temp = q1.poll();
			if(temp != smallest) {
				second_smallest = temp;
				break;
			}
		}
		System.out.println("Smallest is : " + smallest);
		System.out.println("Second Smallest is : " + second_smallest);
	}


}
