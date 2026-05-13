package Lec8;

public class Perfix_Suffix_Sum_Including_Index {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };

	}

	public static void Perfix_Sum(int[] arr) {
		// Perfix Array Including Index
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] + arr[i];
		}
		// Sufix Array Including Index
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] + arr[i];
		}

	}

}
