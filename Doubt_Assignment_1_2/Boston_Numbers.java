package Doubt_Assignment_1_2;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(Is_Boston(n));
	}

	public static int Is_Boston(int n) {
		int sum_of_n = sum_of_Digit(n);
		int i = 2;
		int sum = 0;
		while (n > 1) {
			if (n % i == 0) {
				sum += sum_of_Digit(i);
				n = n / i;
			} else {
				i++;
			}
		}
		if(sum_of_n==sum) {
			return 1;
		}
		else {
			return 0;
		}

	}

	public static int sum_of_Digit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;
	}

}
