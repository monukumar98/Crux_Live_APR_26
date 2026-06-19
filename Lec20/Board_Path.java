package Lec20;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		printpath(n, 0, "");

	}

	public static int printpath(int n, int curr, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 3; dice++) {
			count += printpath(n, curr + dice, ans + dice);
		}
		return count;
//		printpath(n, curr+1, ans+1);
//		printpath(n, curr+2, ans+2);
//		printpath(n, curr+3, ans+3);

	}

}