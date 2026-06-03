package Lec16;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append(10);
		sb.append(20);
		sb.append("hello");
		sb.append(true);
		System.out.println(sb);
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(1, 3));
		StringBuilder sb1 = new StringBuilder("1020hellotrue");
		System.out.println(sb1 == sb);
		System.out.println(sb1.equals(sb));
		System.out.println(sb1.compareTo(sb));// dono StringBuilder ko string convert krne ke baad comapreTo
		String s = sb.toString();
		System.out.println(sb.reverse());
		sb.append("OKY");
		sb.append('a');
		System.out.println(sb.length());
		System.out.println(sb.capacity());// 34
	}

}
