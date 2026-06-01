package Lec15;

import java.util.Scanner;

public class String_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello" + 10 + 20 + "Bye");
		System.out.println("Hello" + (10 + 20) + "Bye");
		System.out.println(10 + 20 + "Hello" + "Bye");
		String str = "Hello";
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		Scanner sc = new Scanner(System.in);
		//String s =sc.next(); 
		String s =sc.nextLine(); 
		System.out.println(s);

	}

}
