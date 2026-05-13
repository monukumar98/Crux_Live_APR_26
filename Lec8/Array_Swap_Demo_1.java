package Lec8;

public class Array_Swap_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 4, 6, -9 };
//		int[] arr = new int[] { 10, 20, 4, 6, -9 };
		System.out.println(arr[0] + " " + arr[1]);// 10 20
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
