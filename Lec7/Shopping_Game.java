package Lec7;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt();// Aayush
			int n = sc.nextInt();// harshit
			Winner(m, n);
			// t--;
		}

	}

	public static void Winner(int m, int n) {
		int phone = 1;
		int a = 0;
		int h = 0;
		while (true) {
			a = a + phone;
			if (a > m) {
				System.out.println("Harshit");
				return;
			}
			phone++;
			h = h + phone;
			if (h > n) {
				System.out.println("Aayush");
				return;
			}
			phone++;
		}

	}

}
