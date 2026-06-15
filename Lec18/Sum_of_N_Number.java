package Lec18;

public class Sum_of_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Sum(n));
	}

	public static int Sum(int n) {
		if (n == 0) {
			return 0;
		}

		int s = Sum(n - 1);
		return n + s;

	}

}

