package edu.rcc.main;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();	
		
		map.put("Red", "Triangle");
		map.put("Blue", "Circle");
		map.put("Green", "Trapezoid");
		
		System.out.println(map.get("Circle"));
		
		for (String key : map.keySet()) {
			System.out.println("Key = " + key + ", value = " + map.get(key));
		}
		
	}

}
