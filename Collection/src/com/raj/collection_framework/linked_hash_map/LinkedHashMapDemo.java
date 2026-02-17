package com.raj.collection_framework.linked_hash_map;

import java.util.LinkedHashMap; 
public class LinkedHashMapDemo { 
	
	public static void main(String[] args) { 

		LinkedHashMap<Integer, String> lsm = new LinkedHashMap<>(); 

		lsm.put(1, "abc"); 
		lsm.put(2, "xyz"); 

		lsm.put(3, "pqr"); 
		lsm.put(4, "def"); 
		lsm.put(null, "ghi"); 

		System.out.println(lsm); 
	} 
}