package Lec48;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 2, 1, 2 };
		System.out.println(SingleNumber(arr));

	}

	public static int SingleNumber(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor ^= nums[i];
		}
		return xor;

	}

}
