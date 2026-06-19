package Lec20;

public class Coin_Toss_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Toss(n, "");

	}

	public static void Toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			Toss(n - 1, ans + "H");
		}
		Toss(n - 1, ans + "T");

	}

}
