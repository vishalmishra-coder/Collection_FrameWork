package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int [] a = new int[size];
		for(int i=0; i<=a.length-1; i++) {
			System.out.println("Enter the elements " + (i+1));
			a[i] = sc.nextInt();
		}
		System.out.println("=======Array Elements are ========");
		for(int x :a) {
			System.out.print(x + " ");
		}
		smallestSecond(a);
	
	}
	
	public static void smallestSecond(int[] a) {
		Queue<Integer> q1 = new PriorityQueue<>();
		for(int x:a) {
			q1.offer(x);
		}
		int smallest = q1.poll();
		int second_smallest = smallest;
		while(!q1.isEmpty()) {
			int temp = q1.poll();
			if(temp!=smallest) {
				second_smallest = temp;
				break;
			}
		}
		System.out.println("\n Smallest is :" + smallest);
		System.out.println(second_smallest);
		
	}
	
	

}
