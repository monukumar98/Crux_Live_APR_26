package Lec42;

import java.util.*;

public class HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(7);
		set.add(9);
		set.add(-2);
		set.add(7);
		set.add(71);
		set.add(9);
		System.out.println(set);
//		// get
//		System.out.println(set.contains(2));
//		System.out.println(set.contains(-2));
//		// remove
//		System.out.println(set.remove(-2));
//		System.out.println(set.remove(2));
//		System.out.println(set);
		TreeSet<Integer> set2 = new TreeSet<>();
		set2.add(10);
		set2.add(7);
		set2.add(9);
		set2.add(-2);
		set2.add(-2);
		set2.add(7);
		set2.add(71);
		set2.add(9);
		System.out.println(set2);
		LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
		set3.add(10);
		set3.add(7);
		set3.add(9);
		set3.add(-2);
		set3.add(7);
		set3.add(71);
		set3.add(9);
		System.out.println(set3);
		
		for(int x:set) {
			System.out.print(x+" ");
		}

	}

}

