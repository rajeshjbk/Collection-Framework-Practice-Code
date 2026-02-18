package com.raj.collection_framework.identity_hash_map;

import java.util.HashMap; 
import java.util.IdentityHashMap; 

public class IdentityHashMapDemo1 { 

	public static void main(String[] args) { 

		HashMap<String,Integer> map = new HashMap<>(); 

		map.put("Java", 1234); 
		map.put(new String("Java"), 5555); 

		System.out.println(map.size()+" : "+map); 

		System.out.println("..........................."); 

		IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>(); 

		ihm.put("Java", 1234); 
		ihm.put(new String("Java"), 5555); 

		System.out.println(ihm.size()+" : "+ihm); 
	} 
} 
