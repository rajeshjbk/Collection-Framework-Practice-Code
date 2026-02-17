package com.raj.collection_framework.hash_map;
import java.util.HashMap; 
import java.util.Map; 

//computeIfAbsent(K key, Function<? Super K, ? extends V> mappingFunction) 
public class HashMapDemo7 { 
	
	public static void main(String[] args) { 

		Map<String, Integer> map = new HashMap<>(); 

		map.computeIfAbsent("A", key -> key.length()); 
		map.computeIfAbsent("A", key -> 100); 
		map.computeIfAbsent("B", key -> 200); 
		map.computeIfAbsent("C", key -> null); 
		map.computeIfAbsent("null", key -> 400); 

		System.out.println(map); 
	} 
}