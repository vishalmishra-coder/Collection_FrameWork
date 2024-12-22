package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program8 {
	public static void main(String[] args) {
		int [] a = { 10 , 12 , 13 , 10 ,12 , 10 , 13  };
		printFreq(a);
		System.out.println("==============next==================");
		printFreq1(a);
		System.out.println("==============next==================");
		printFreq2(a);
		System.out.println("==============next==================");
		System.out.println("Number with maximum frequency is : " + printFreq3(a));
		System.out.println("==============next==================");
		System.out.println("First Non -Repeating Number : " + printFreq4(a));
		System.out.println("==============next==================");
		System.out.println("First Non -Repeating Number : " + printFreq5(a));
	}
	
	public static void printFreq(int[]a) {
//		Print the number whose frequency is exactly one
		Map<Integer , Integer> m1 = new LinkedHashMap<>();
		for(int x: a) {
			if(m1.containsKey(x)) {
				m1.put(x, m1.get(x)+1);
			}
			else {
				m1.put(x, 1);
			}
		}
		System.out.println(m1);
		Set<Map.Entry<Integer , Integer>> ens = m1.entrySet();
		for(Map.Entry<Integer, Integer> p : ens) {
			if(p.getValue() ==1)
				System.out.println(p.getKey());
		}
		
	}
	
	
	
	public static void printFreq1(int[]a) {
//		Print the number whose appeared more than once.
		Map<Integer , Integer> m1 = new LinkedHashMap<>();
		for(int x: a) {
			if(m1.containsKey(x)) {
				m1.put(x, m1.get(x)+1);
			}
			else {
				m1.put(x, 1);
			}
		}
		System.out.println(m1);
		Set<Map.Entry<Integer , Integer>> ens = m1.entrySet();
		for(Map.Entry<Integer, Integer> p : ens) {
			if(p.getValue() >1)
				System.out.println(p.getKey());
		}
		
	}
	
	public static void printFreq2(int[]a) {
//		Print the number whose frequency is exactly one
		Map<Integer , Integer> m1 = new LinkedHashMap<>();
		for(int x: a) {
			if(m1.containsKey(x)) {
				m1.put(x, m1.get(x)+1);
			}
			else {
				m1.put(x, 1);
			}
		}
		System.out.println(m1);
		Set<Map.Entry<Integer , Integer>> ens = m1.entrySet();
		for(Map.Entry<Integer, Integer> p : ens) {
			if(p.getValue()%2==0)
				System.out.println(p.getKey() + " is " + p.getValue() + " times");
		}
		
	}
	
	public static int printFreq3(int[]a) {
//		Print the number whose frequency is exactly one
		Map<Integer , Integer> m1 = new LinkedHashMap<>();
		for(int x: a) {
			if(m1.containsKey(x)) {
				m1.put(x, m1.get(x)+1);
			}
			else {
				m1.put(x, 1);
			}
		}
		System.out.println(m1);
		Set<Map.Entry<Integer , Integer>> ens = m1.entrySet();
		int max =0; int elem =0;
		for(Map.Entry<Integer, Integer> p : ens) {
			if(p.getValue()>max)
			{
				max = p.getValue();
				elem =p.getKey();
			}
			
		}
		return elem;
		
	}
	
	
	public static int printFreq4(int[]a) {
//		Print the number whose frequency is exactly one
		Map<Integer , Integer> m1 = new LinkedHashMap<>();
		for(int x: a) {
			if(m1.containsKey(x)) {
				m1.put(x, m1.get(x)+1);
			}
			else {
				m1.put(x, 1);
			}
		}
		System.out.println(m1);
		Set<Map.Entry<Integer , Integer>> ens = m1.entrySet();
		for(Map.Entry<Integer, Integer> p : ens) {
			if(p.getValue()==1)
			{
				return p.getKey();
			}
			
		}
		return -1;
		
	}
	
	
	public static String printFreq5(int[]a) {
//		Print the number whose frequency is exactly one
		Map<Integer , Integer> m1 = new LinkedHashMap<>();
		for(int x: a) {
			if(m1.containsKey(x)) {
				m1.put(x, m1.get(x)+1);
			}
			else {
				m1.put(x, 1);
			}
		}
		System.out.println(m1);
		Set<Map.Entry<Integer , Integer>> ens = m1.entrySet();
		for(Map.Entry<Integer, Integer> p : ens) {
			if(p.getValue()==1)
			{
				return (p.getKey() + " is " + p.getValue());
			}
			
		}
		return " -1 , -1 ";
		
	}

}
