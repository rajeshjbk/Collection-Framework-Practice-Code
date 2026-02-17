package com.raj.collection_framework.hash_set;

import java.util.HashSet;

public class HashSetDemo2 { 
	
	public static void main(String[] args) { 
		
		HashSet<String> hs = new HashSet<>(); 
		hs.add("Ravi"); 
		hs.add("Vijay"); 
		hs.add("Ravi"); 
		hs.add("Ajay"); 
		hs.add("Palavi"); 
		hs.add("Sweta"); 
		hs.add(null);  
		hs.add(null); 

		hs.forEach(str -> System.out.println(str)); 
	} 
} 