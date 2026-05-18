package Doubt_Assignment_1_2;

import java.util.Scanner;

public class Odd_and_Even_back_in_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int car_no = sc.nextInt();
			Odd_and_Even_back(car_no);
		}

	}

	public static void Odd_and_Even_back(int car_no) {
		int even_sum = 0;
		int odd_sum = 0;
		while (car_no > 0) {
			int rem = car_no % 10;
			if (rem % 2 == 0) {
				even_sum += rem;
			} else {
				odd_sum += rem;
			}
			car_no = car_no / 10;
		}
		if (even_sum % 4 == 0 || odd_sum % 3 == 0) {
			System.out.println("Yes");

		} else {
			System.out.println("No");
		}
	}

}
