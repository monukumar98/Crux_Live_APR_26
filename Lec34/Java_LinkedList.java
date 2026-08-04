package Lec34;

import java.util.*;

public class Java_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addFirst(10);
		ll.addFirst(20);
		System.out.println(ll);
		ll.addLast(19);
		ll.addLast(12);
		System.out.println(ll);
		System.out.println(ll.get(1));
		System.out.println(ll.remove(1));
		ll.add(-1);
		System.out.println(ll);
		// Queue
		System.out.println("**********************************");
		// LinkedList<Integer> q = new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(5);
		q.add(3);
		q.add(7);
		System.out.println(q.remove());// removefirst
		System.out.println(q.poll());// removefirst
		System.out.println(q.peek());// getfirst
		System.out.println(q);

	}

}
