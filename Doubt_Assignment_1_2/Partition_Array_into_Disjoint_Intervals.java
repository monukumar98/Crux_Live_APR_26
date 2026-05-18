package Doubt_Assignment_1_2;

public class Partition_Array_into_Disjoint_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 1, 0, 6, 12 };
		System.out.println(Partition_Array(arr));

	}

	public static int Partition_Array(int[] arr) {
		int n = arr.length;
		// prefix
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		// suffix
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.min(right[i + 1], arr[i]);
		}
		for (int i = 0; i < n - 1; i++) {
			if (left[i] <= right[i + 1]) {
				return i+1;
			}
		}
		return 0;

	}

}
