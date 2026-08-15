package Lec39;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababaaabaaaababbbbaa";
		int k = 2;
		int flip_a = maximum_perfectness(s, k, 'a');
		int flip_b = maximum_perfectness(s, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));

	}

	public static int maximum_perfectness(String s, int k, char ch) {
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < s.length()) {
			// 1. window grow
			if (s.charAt(ei) == ch) {
				flip++;
			}
			// 2. window Shrink
			while (flip > k && si <= ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// 3. ans calculate
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;

	}

}
