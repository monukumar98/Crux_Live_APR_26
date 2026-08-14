package Lec38;

public class Abstract_Demo_Part1_Client {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Abstract_Demo_Part1 ab1 = new Abstract_Demo_Part1();
//		ab1.fun();
		Abstract_Demo_Part2 ab2 =  new Abstract_Demo_Part2();
		Abstract_Demo_Part1 ab1 = new Abstract_Demo_Part1() {

			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int get() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}

}
