package Lecture1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello Gurmeet Chahal");
//		 Main.InnerClass a1= new Main.InnerClass();
//		 a1.func(12);
//		 
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(21);
		System.out.println(al);

		// Q1. You are given a map of numbers and theif frequency.
		// 2,4
		// 1,45
		// 3,50

		// 2*4 + 1*45 + 3*50=203;

		Map<Integer, Integer> frequencyMap = new HashMap<>();
		// Map is a interface and hashmap is extending that interface.

		frequencyMap.put(2, 4);
		frequencyMap.put(1, 45);
		frequencyMap.put(3, 50);
		frequencyMap.put(2, 5); // This will replace first occurence of Key 2.IN hashmap key can be presnt only
								// once

		int sum = 0;
		Set<Map.Entry<Integer, Integer>> entryset = frequencyMap.entrySet();
		for (Map.Entry<Integer, Integer> entry : entryset) {
			sum += entry.getKey() * entry.getValue();
			// this is enhance for loop or for each loop
		}
		System.out.println(sum);
//	Iterator<Map.Entry<Integer,Integer>> elements=frequencyMap.entrySet().iterator();
//		
//		System.out.println();

		/**
		 * Collections List
		 * 
		 * Map
		 * 
		 * Set
		 */
		// instance of class and refrence of class.
		MyHashMap myhashmp = new MyHashMap(); // in this we can use all function of mymap and myhashmap.
		// Refrence of interface and Instance of class
		MyMap mymap = new MyHashMap(); // here we can only acces the function of interface not class i.e Mymap
		MyMap mp = new MyMap() {

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a + b + 1;
			}

			// @Override
//		public int subtract(int a, int b) {
//			// TODO Auto-generated method    F
//			return 0;
//		}
		};
		System.out.println(mymap.add(4, 2));
		System.out.println(mp.add(4, 2));

		MyMap mp2 = (c, d) -> c + d + 1;
		MyMap mp3 = (c, d) -> {

			System.out.println("Mluti line lambda");
			return c + d + 2;
		};
		

		System.out.println(mp2.add(4, 2));
		System.out.println(mp.add(4, 2));
		System.out.println(mp3.add(4, 2));
	}

	private static class InnerClass {
		private int a;

		public void func(int a) {
			this.a = a;
			System.out.println(a);
		}
	}
}
// JDK - Compiles our code  from .java -->  .class
// JRE -  contains JVM where .class files runs.
// Byte code can be created for main class not for inner class beacuse inner class can be called via main class.
//Maven is a tool which is used to create jar file.
// We can use functional interface annotiaon to put restriction it give erro when we try to define more than one abstarct function. 