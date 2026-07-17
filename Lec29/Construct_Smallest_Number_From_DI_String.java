package Lec29;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "IIIDIDDD";
	}

	public static String smallestNumber(String pattern) {
		int[] ans = new int[pattern.length() + 1];
		Stack<Integer> st = new Stack<>();
		int c = 1;
		for (int i = 0; i <= pattern.length(); i++) {
			if (i == pattern.length() || pattern.charAt(i) == 'I') {
				ans[i] = c++;
				while (!st.isEmpty()) {// j=i-1; j>=0&& p.ch(j)=='D' j--
					ans[st.pop()] = c++;
				}
			} else {
				st.push(i);
			}
		}
		String str="";
		for (int i = 0; i < ans.length; i++) {
			str=str+ans[i];
		}
		return str;

	}

}
