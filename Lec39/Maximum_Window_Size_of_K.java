package Lec39;

public class Maximum_Window_Size_of_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 6, 7, 4, 2, 1, 3, 8 };
		int k = 3;
		System.out.println(Window_Size_of_K(arr, k));

	}

	public static int Window_Size_of_K(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		for (int i = k; i < arr.length; i++) {
			// 1. window grow
			sum += arr[i];
			// 2. window Shrink
			sum -= arr[i - k];
			// 3. ans calculate krna
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
