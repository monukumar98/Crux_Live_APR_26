package Lec39;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7, 2, 3, 1 };
		int k = 3;
	}

	public static int[] Window_Maximum(int[] arr, int k) {
		int n = arr.length;
		int[] ans = new int[n - k + 1];
		int j = 0;// ans wala array ka index
		Deque<Integer> dq = new ArrayDeque<Integer>();
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
				dq.removeLast();

			}
			dq.addLast(i);
		}
		ans[j++] = arr[dq.getFirst()];
		for (int i = k; i < arr.length; i++) {
			// window grow
			while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
				dq.removeLast();

			}
			dq.addLast(i);
			// window shrink
			if(i-k==dq.getFirst()) {
				dq.removeFirst();
			}
			// ans update
			ans[j++] = arr[dq.getFirst()];
		}
		return ans;

	}

}





