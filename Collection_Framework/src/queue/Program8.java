package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program8 {
	public static void main(String[] args) {
//		Deque (Doubly Ended Queue)
		System.out.println("=====addFirst() and addLast()");
		Deque<Integer> dq = new ArrayDeque<>();
		dq.add(29); dq.addFirst(10); dq.addFirst(19);
		dq.addLast(23); dq.addLast(27); dq.addFirst(31);
		System.out.println(dq);
		System.out.println("=====offerFirst() and offerLast()");
		
		dq.offerFirst(34); dq.offerLast(56);
		System.out.println(dq);
		
		System.out.println("=====removeFirst() and removeLast()");
		dq.removeFirst();  dq.removeLast();
		
		System.out.println(dq);
		
		System.out.println("=====pollFirst() and pollLast()");
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		
		System.out.println("=====getFirst() and getLast()");
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		System.out.println(dq);
		
		System.out.println("=====peekFirst() and peekLast()");
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq);
		
		
	}


}
