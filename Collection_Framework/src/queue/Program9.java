package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program9 {
	public static void main(String[] args) {
//		Deque(Doubly ended queue)
		Deque<Integer> dq = new ArrayDeque<>();
		dq.add(29); dq.addFirst(10); dq.addFirst(19);dq.addFirst(10);
		dq.addLast(23); dq.addLast(29); dq.addFirst(31);
		System.out.println("===========removeFirstOccurence()=============");
		System.out.println(dq);
		dq.removeFirstOccurrence(29);
		System.out.println(dq);
		System.out.println("===========removeLastOccurence()=============");
		dq.removeLastOccurrence(10);
		System.out.println(dq);
		
		
	}

}
