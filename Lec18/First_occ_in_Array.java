package Lec18;

public class First_occ_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 4 };
		int item = 4;
		System.out.println(First_Occ(arr, item, 0));

	}

	public static int First_Occ(int[] arr, int item, int i) {
		if (i >= arr.length) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}
		return First_Occ(arr, item, i + 1);
	}

}
