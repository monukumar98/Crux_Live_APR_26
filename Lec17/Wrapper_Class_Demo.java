package Lec17;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1 = 10;
		int a2 = 5;
		System.out.println(a1);
		System.out.println(a2);
		Character ch = 'a';
		Long l = 899L;
		a1 = a2;// Auto-Boxing
		System.out.println(a1);
		a2 = a1;// Un-Boxing
		System.out.println(a2);
		Integer b1 = 19;
		Integer b2 = 19;
		Integer b3 = 190;
		Integer b4 = 190;
		System.out.println(b1 == b2);
		System.out.println(b3 == b4);
		System.out.println(b3.equals(b4));
		Boolean c1 = false;
		Boolean c2 = false;
		System.out.println(c1==c2);
		Character ch1='a';
		Character ch2='a';
		System.out.println(ch1==ch2);

	}

}



