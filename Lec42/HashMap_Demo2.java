package Lec42;

import java.util.*;

public class HashMap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Ankit", 77);
		map.put("Raj", 87);
		map.put("Shiva", 55);
		map.put("Ankita", 97);
		map.put("Dj", 73);
		map.put("Puneet", 56);
		map.put("Ankita", 17);
//		map.put(null, 56);
	//	System.out.println(map);
	//	System.out.println(map.keySet());
//		Set<String> key=map.keySet();
//		for(String k:key) {
//			System.out.println(k+" "+map.get(k));
//		}
//		Set<String> key=map.keySet();
		for(String k:map.keySet()) {
			System.out.println(k+" "+map.get(k));
		}
		
	}

}
