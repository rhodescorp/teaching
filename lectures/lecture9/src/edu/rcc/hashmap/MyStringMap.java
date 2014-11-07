package edu.rcc.hashmap;

public class MyStringMap {

	private String[] map;
	
	public MyStringMap() {
		map = new String[100];
		
	}
	
	public MyStringMap(int size) {
		map = new String[size];
	}
	
	public void put(String key, String value) {
		map[hash(key)] = value;
	}
	
	public String get(String key) {
		return map[hash(key)];
	}
	
	private int hash(String s) {
		int prime = 31;
		int result = 0;
		for (int i = 0; i < s.length(); ++i) {
			result += Math.pow(prime, i)*s.charAt(i);
		}
		return Math.abs(result%map.length);
	}
}
