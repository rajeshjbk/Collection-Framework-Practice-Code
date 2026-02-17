package com.raj.collection_framework.hash_map;
import java.util.Collection; 
import java.util.HashMap; 
import java.util.Set; 

public class HashMapDemo3 { 
	
	public static void main(String[] args) { 

		HashMap<Integer,String> newmap1 = new HashMap<>(); 

		HashMap<Integer,String> newmap2 = new HashMap<>(); 

		newmap1.put(1, "OCPJP"); 
		newmap1.put(2, "is"); 
		newmap1.put(3, "best"); 

		System.out.println("Values in newmap1: "+newmap1); 


		newmap2.put(4, "Exam"); 

		newmap2.putAll(newmap1); 

		System.out.println("Iterating through forEach()"); 
		newmap2.forEach((k,v)->System.out.println(k+" : "+v)); 

		System.out.println("All the Unique keys"); 
		Set<Integer> setOfKey = newmap2.keySet(); 
		System.out.println(setOfKey); 

		System.out.println("All the values"); 
		Collection<String> values = newmap2.values(); 
		System.out.println(values); 

		System.out.println("......................................"); 

		HashMap<Integer,String> hm1 = new HashMap<>(); 

		hm1.put(1, "Ravi"); 
		hm1.put(2, "Rahul"); 
		hm1.put(3, "Rajan"); 

		HashMap<Integer,String> hm2 = new HashMap<>(hm1); 
		System.out.println("Mapping of HashMap hm1 are : "+hm1); 
		System.out.println("Mapping of HashMap hm1 are : "+hm2); 

	} 
}