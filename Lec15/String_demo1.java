package Lec15;

public class String_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1 == s3);// Address compare krta hai 
		System.out.println(s1 == s2);// Address compare krta hai 
		System.out.println(s1.equals(s3));// content  compare krta hai 
		int [] arr = new int [5];
		System.out.println(arr.length);
		System.out.println(s1.length());

	}

}

