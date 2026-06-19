package Lec20;

public class Count_Seqeunnce {
//	static int val = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.println("\n" + Print(ques, ""));
		// System.out.println("\n"+val);

	}

	public static int Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int x = Print(ques.substring(1), ans);// bc,""--> no
		int y = Print(ques.substring(1), ans + ch);// bc,"a"-->yes
		return x + y;

	}
//	public static void Print(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.print(ans+" ");
//			val++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		Print(ques.substring(1), ans);// bc,""--> no
//		Print(ques.substring(1), ans + ch);// bc,"a"-->yes
//		
//	}

}
