package Lec7;

public class Fun_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 9;
		int b = 11;
//		int x= addition(a, b);
//		System.out.println(x);
		System.out.println(addition(b, a));
		System.out.println("Bye");
	}

	public static int addition(int a, int b) {

		int c = a + b;
		// System.out.println(c);
		return c + sub(c, a);

	}

	public static int sub(int a, int b) {

		int c = a - b;
		// System.out.println(c);
		return c;

	}

}
