package Lec28;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.capacity());
		// push
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		// view
		System.out.println(st.peek());// top ka data view hoga
		// remove
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		
		for(int x:st) {
			System.out.print(x+" ");
		}
		System.out.println();

	}

}
