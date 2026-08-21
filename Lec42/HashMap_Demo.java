package Lec42;

import java.util.*;

public class HashMap_Demo {

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
		System.out.println(map);
//		// containsKey
//		System.out.println(map.containsKey("Amisha"));
//		System.out.println(map.containsKey("Raj"));
//		// get
//		System.out.println(map.get("Amisha"));
//		System.out.println(map.get("Raj"));
//		// remove
//		System.out.println(map.remove("Amisha"));
//		System.out.println(map.remove("Raj"));
//		System.out.println(map);
//		System.out.println(map.size());
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Ankit", 77);
		map1.put("Raj", 87);
		map1.put("Shiva", 55);
		map1.put("Ankita", 97);
		map1.put("Dj", 73);
		map1.put("Puneet", 56);
		map1.put("Ankita", 17);
//	    map1.put(null, 56);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Ankit", 77);
		map2.put("Raj", 87);
		map2.put("Shiva", 55);
		map2.put("Ankita", 97);
		map2.put("Dj", 73);
		map2.put("Puneet", 56);
		map2.put("Ankita", 17);
		// map2.put(null, 56);
		System.out.println(map2);
	}

}
