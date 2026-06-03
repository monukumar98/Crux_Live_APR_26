package Lec16;

public class Stribuilder_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String_Time();
		StringBulider_Time();
	}

	public static void StringBulider_Time() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000_000; i++) {
			sb.append(i);
		}
	}

	public static void String_Time() {
		String s = "";
		for (int i = 0; i < 1000_000; i++) {
			s = s + i;
		}
	}

}
