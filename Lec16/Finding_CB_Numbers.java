package Lec16;

import java.util.Scanner;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(count_cb_number(s));

	}

	public static int count_cb_number(String s) {
		int c = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				long num = Long.parseLong(s.substring(i, j));// i to j-1
				if (isCbnumber(num) && isnotvisited(visited, i, j - 1)) {
					// marked
					for (int k = i; k < j; k++) {
						visited[k] = true;
					}
					c++;
				}

			}
		}
		return c;
	}

	public static boolean isnotvisited(boolean[] visited, int si, int ei) {
		// TODO Auto-generated method stub
		for (int i = si; i <= ei; i++) {
			if (visited[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCbnumber(long num) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}

}
