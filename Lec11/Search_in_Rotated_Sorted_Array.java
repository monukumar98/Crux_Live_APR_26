package Lec11;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

	}

	public static int Search(int[] arr, int target) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			// mid upper line pe hai
			if (arr[mid] >= arr[lo]) {
				if (arr[lo] <= target && arr[mid] > target) {
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}

			} else {// mid lower line pe hu
				if (arr[mid] < target && arr[hi] >= target) {
					lo = mid + 1;

				} else {
					hi = mid - 1;
				}

			}
			
		}
		return -1;
	}

}
