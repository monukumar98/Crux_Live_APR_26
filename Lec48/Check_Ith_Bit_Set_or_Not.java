package Lec48;

public class Check_Ith_Bit_Set_or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int pos = 4;
		System.out.println(Check_Ith_Bit(n, pos));

	}
	public static boolean Check_Ith_Bit(int n,int pos) {
		
		int mask = (1<<pos);
		if((n&mask)==0) {
			return false;
		}
		else {
			return true;
		}
		
	}

}
