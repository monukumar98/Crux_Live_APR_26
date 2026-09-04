package Lec48;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		System.out.println(Number(n));
	}

	public static int Number(int i) {
		int mul = 5;
		int sum = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				sum += mul;
			}
			mul = mul * 5;
			i >>= 1;
		}
		return sum;
	}

}
