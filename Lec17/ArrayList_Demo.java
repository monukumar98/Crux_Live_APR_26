package Lec17;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();// 10
		System.out.println(list);
		System.out.println(list.size());
		// add
		list.add(10);// O(1)
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(1, -9);// O(N)
		System.out.println(list);
		// get
		System.out.println(list.get(2));// O(1)
		// remove
		System.out.println(list.remove(1));
		System.out.println(list);
		// upadate
		list.set(1, -2);
		System.out.println(list);
		Collections.sort(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);

	}

}
