package Lec26;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 5, 7 };
		int[] arr2 = { 1, 3, 5, 9, 12, 13 };
		int[] a = Merge_Two_Array(arr1, arr2);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static int[] Merge_Two_Array(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k++] = arr1[i++];

			} else {
				ans[k++] = arr2[j++];
			}
		}
		while (i < n) {
			ans[k++] = arr1[i++];
		}
		while (j < m) {
			ans[k++] = arr2[j++];
		}
		return ans;
	}

}
