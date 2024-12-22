package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program5 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(20);  l1.add(5); l1.add(21); l1.add(47);
		l1.add(34);l1.add(17);
		System.out.println("List is : " + l1);
		System.out.println("Sorted List is : " + sortList(l1));
		
		
	}
	public static List sortList(List l1) {
		Queue<Integer> q1 = new PriorityQueue<>(l1);
		l1.clear();
		while(!q1.isEmpty()) {
			l1.add(q1.poll());
		}
		return l1;
		
	}

}
