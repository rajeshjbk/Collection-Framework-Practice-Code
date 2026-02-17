package com.raj.collection_framework.hash_map;

import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 

public class HashMapDemo9 { 

	public static void main(String[] args) { 

		Map<String, List<String>> studentSubject = new HashMap<>(); 

		studentSubject.computeIfAbsent("Scott", key -> new ArrayList<String>()).add("Phy"); 
		studentSubject.computeIfAbsent("Scott", key -> new ArrayList<String>()).add("Che"); 

		studentSubject.computeIfAbsent("Alen", key -> new ArrayList<String>()).add("History"); 
		studentSubject.computeIfAbsent("Alen", key -> new ArrayList<String>()).add("Geography"); 

		System.out.println(studentSubject); 

		studentSubject.computeIfPresent("Scott", (key, value) -> {  
			value.add("Math"); 
			return value; 
		} 
				); 

		studentSubject.computeIfPresent("Alen", (key, value) -> {  
			value.add("Economics"); 
			return value; 
		} 
				); 
		System.out.println(studentSubject);  
	} 
} 