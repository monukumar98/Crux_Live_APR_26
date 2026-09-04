package Lec48;

public class SubSequnce_Without_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		SubSequnce(s);

	}

	public static void SubSequnce(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			print(s, i);

		}
	}

	private static void print(String s, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		StringBuilder sb = new StringBuilder();
		while (i > 0) {
			if ((i & 1) != 0) {
				sb.append(s.charAt(pos));
			}
			i >>= 1;
			pos++;
		}
		System.out.println(sb);

	}

}
