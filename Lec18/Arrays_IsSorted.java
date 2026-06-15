package Lec18;

public class Arrays_IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 4 };
		System.out.println(IsSorted(arr, 0));
	}
	public static boolean IsSorted(int []arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return IsSorted(arr, i+1);
	}

}
