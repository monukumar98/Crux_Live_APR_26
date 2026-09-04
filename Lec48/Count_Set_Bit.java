package Lec48;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(countbit(n));// TC-> O(log(N)) base 2

	}

	public static int fastcountbit(int n) {
		int c = 0;
		while (n > 0) {
			n = (n & (n - 1));
			c++;
		}
		return c;
	}

	public static int countbit(int n) {

		int c = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				c++;
			}
			n = n >> 1;
		}
		return c;

	}

}
