package com.raj.collection_framework.hash_map;
import java.util.HashMap; 

public class HashMapDemo6 { 
	
	public static void main(String[] args) { 

		String text = "java is fun, java is powerful java is great"; 

		String[] words = text.split(" "); 

		HashMap<String,Integer> ordcount = new HashMap<>(); 

		for(String word : words) { 
			ordcount.put(word, ordcount.getOrDefault(word, 0)+1); 
		} 

		System.out.println("Word Frequency: "+ordcount); 
	} 
} 