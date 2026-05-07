package Lec6;

import java.util.Scanner;

public class Data_Types_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte b = (byte)(428);//-84
		Scanner sc = new Scanner(System.in);
		byte b = (byte) (300);// 4
		short s = 5;
		int x = 6;
		long l = 9565_567_674l;//956556767
		System.out.println(b);
		System.out.println(s);
		System.out.println(x);
		System.out.println(l);
		x = sc.nextInt();
		l = sc.nextLong();
		s = sc.nextShort();
		b = sc.nextByte();
		System.out.println(x);
		System.out.println(l);
		System.out.println(s);
		System.out.println(b);
	}

}
