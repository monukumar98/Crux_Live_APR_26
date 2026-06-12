package Lec17;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);// O(1)
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(1, -9);// O(N)
		list.add(5);
		list.add(51);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(21);
		System.out.println(list.size());
		System.out.println(list);
		Vector<Integer> v = new Vector<>();
		System.out.println(v.capacity());// grow 2 times

	}

}
