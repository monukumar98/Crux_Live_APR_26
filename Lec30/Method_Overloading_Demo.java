package Lec30;

public class Method_Overloading_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 56));
		System.out.println(add(2, 5, 6));
		System.out.println(add(2, 5, 6.9));
		System.out.println(add(2, 56, 3, 2, 2, 2, 2, 3, 11, 3, 4, 5, 4, 4, 4));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int add(long x, int  ... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
