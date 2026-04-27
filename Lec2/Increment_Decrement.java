package Lec2;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		// x++;// x = x + 1;
//		System.out.println(x++);// 5
//		System.out.println(x);// 6
//		System.out.println(--x);// 4
//		System.out.println(x);//  4

		// int y = x++ - ++x + --x - x++ - --x;//-8
		int y = x++ + --x + x++ + --x - ++x;
		System.out.println(y);// 14

	}

}
