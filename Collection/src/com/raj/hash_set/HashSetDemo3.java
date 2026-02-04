package com.raj.hash_set;

import java.util.HashSet;
import java.util.Arrays; 
 
public class HashSetDemo3 { 
	
	public static void main(String[] args) { 

		Boolean values[] = new Boolean[5]; 
		HashSet<Object> hs = new HashSet<>(); 
		values[0] = hs.add(12); 
		values[0] = hs.add(12); 
		values[0] = hs.add(13); 
		values[0] = hs.add(13); 
		values[4] = hs.add(new String("Java")); 
		System.out.println(Arrays.toString(values));  
	} 
}