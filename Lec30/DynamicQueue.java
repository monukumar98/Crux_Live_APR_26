package Lec30;
import Lec28.*;
public class DynamicQueue  extends Queue{

	@Override 
	public void Enqueue(int x) throws Exception {
		if(isFull()) {
			int [] new_arr= new int [2*size()];
			for (int i = 0; i < arr.length; i++) {
				int idx=(front+i)%arr.length;
				new_arr[i]=arr[idx];
				
			}
			front=0;
			arr=new_arr;
			
		}
		super.Enqueue(x);
		
	}

}
