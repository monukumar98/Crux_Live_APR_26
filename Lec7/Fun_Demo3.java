package Lec7;

public class Fun_Demo3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 9;
		int b = 11;
//		int x= addition(a, b);
//		System.out.println(x);
		System.out.println(val);// 100
		System.out.println(addition(b, a));// 29
		System.out.println(val);// ??
		System.out.println("Bye");
	}

	public static int addition(int a, int b) {

		int c = a + b;
		// System.out.println(c);
		int val = 90;
		// Fun_Demo3.val = Fun_Demo3.val - 5;
		Fun_Demo3.val = val - 5;
		// val = val - 5;
		return c + sub(c, a);

	}

	public static int sub(int a, int b) {

		int c = a - b;
		// System.out.println(c);
		return c;

	}
}
