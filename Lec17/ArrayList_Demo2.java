package Lec17;

import java.util.ArrayList;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);// O(1)
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(1, -9);// O(N)
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		int[] arr = new int[5];

		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x : list) {
			System.out.print(x + " ");
		}
	}

}
