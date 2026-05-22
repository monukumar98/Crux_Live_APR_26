package Lec11;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		DNF(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void DNF(int[] arr) {
		int zero = 0;
		int two = arr.length - 1;
		int i = 0;
		while (i <= two) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[zero];
				arr[zero] = temp;
				zero++;
				i++;

			} else if (arr[i] == 2) {
				int temp = arr[i];
				arr[i] = arr[two];
				arr[two] = temp;
				two--;
			} else {
				i++;
			}
		}
	}

}
