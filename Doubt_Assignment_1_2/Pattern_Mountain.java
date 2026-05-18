package Doubt_Assignment_1_2;

import java.util.*;

public class Pattern_Mountain {
	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);

		int n;
		n = ob.nextInt();
		int sp = 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "\t");
			}
			for (int k = i; k < n; k++) {
				System.out.print(" " + "\t");
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print(" " + "\t");
			}
			sp--;
			int k = i;
			if(i==n) {
				k--;
			}
			for (; k >= 1; k--) {
				if (k != n) {
					System.out.print(k + "\t");
				} else {
					System.out.print(n - 1+"\t");
				}
			}
			System.out.print("\n");
		}
	}
}