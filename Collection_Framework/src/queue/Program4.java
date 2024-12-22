package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program4 {
	public static void main(String[] args) {
		int [] a = { 10 , 13 , 5 , 7 , 24 , 28 };
		System.out.println("Before Sorting array is : " );
		for(int x: a)
			System.out.print(x + " ");
		sortArray(a);
		System.out.println("\nAfter Sorting array is : " );
		for(int x: a)
			System.out.print(x + " ");
	
	}
	
	public static int[] sortArray(int[] a) {
		Queue<Integer> q1 = new PriorityQueue<>();
		for(int x: a) {
			q1.offer(x);
		}
		for(int i=0; i<a.length; i++) 
		{
			a[i] = q1.poll();
			
	    }
		
		
		return a;
	}

}
