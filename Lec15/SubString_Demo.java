package Lec15;

public class SubString_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
		System.out.println(s.substring(2, 5));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 2));
		print(s);

	}

	public static void print(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
//				if(isPalindrom(s.substring(i, j))) {
//					System.out.println(s.substring(i, j));
//				}
			}
		}
	}

	public static boolean isPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
