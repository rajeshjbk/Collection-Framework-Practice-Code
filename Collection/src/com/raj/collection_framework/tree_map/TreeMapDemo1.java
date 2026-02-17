package com.raj.collection_framework.tree_map;

import java.util.Collection; 
import java.util.Iterator; 
import java.util.TreeMap; 

public class TreeMapDemo1 {
	
	public static void main(String[] args) { 

		TreeMap map = new TreeMap(); 

		map.put("one", "1"); 
		map.put("two", null); 
		map.put("three", 3); 
		map.put("four", true); 

		displayMap(map); 

		map.forEach((k,v) -> System.out.println("Key="+k+", Value="+v)); 
	} 
	public static void displayMap(TreeMap map) { 

		Collection c = map.entrySet();  //set<Map.Entry> 

		Iterator i = c.iterator(); 
		i.forEachRemaining(x-> System.out.println(x)); 
	} 
} 