package Lec11;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 149;
		int k = 3;
		System.out.println(root(n, k));

	}

	public static int root(int n, int k) {
		int ans = 0;
		int lo = 1;
		int hi = n;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

}
