package Doubt_Assignment_1_2;

import java.util.Scanner;

public class Pattern_with_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				if (i == 1 || i == star) {
					System.out.print(row + " ");
				} else {
					System.out.print(0 + " ");
				}
				i++;
			}
			// next line ki prep
			System.out.println();
			row++;
			star++;
		}

	}

}
