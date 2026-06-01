package Lec15;

public class String_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		s1 = s1 + "Bye";
		s1 = s1.concat("Bye");
		String s4 = "Hello" + "Bye";
		String s5 = "Hello" + "Bye";
		System.out.println(s4==s5);

	}

}

