package com.raj.collection_framework.linked_hash_map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
	
	public static void main(String[] args) { 

		LinkedHashMap<String, String> lsm1 = new LinkedHashMap<>(); 

		lsm1.put("Ravi", "1234"); 
		lsm1.put("Rahul", "1234"); 
		lsm1.put("Aswin", null); 
		lsm1.put("Samir", null); 

		lsm1.forEach((k,v) -> System.out.println(k+" : "+v)); 
	} 
}