package com.raj.collection_framework.nevigable_map;
import java.util.NavigableMap; 

import java.util.TreeMap; 
public class NavigableMapMethodsDemo { 
	public static void main(String[] args) { 
		NavigableMap<Integer,String> map = new TreeMap<>(); 
		map.put(102, "PreetiLaxmi"); 
		map.put(100, "Radhika"); 
		map.put(103, "Raj"); 
		map.put(105, "Ayush"); 
		map.put(104, "Ravi"); 
		map.put(107, "Asha"); 
		
		System.out.println(map); 
		System.out.println("ceilingEntry(101): "+map.ceilingEntry(101)); 
		System.out.println("ceilingKey(101): "+map.ceilingKey(101)); 
		System.out.println("floorEntry(108): "+map.floorEntry(108)); 
		System.out.println("floorKey(108): "+map.floorKey(108)); 
		System.out.println("higherEntry(100): "+map.higherEntry(100)); 
		System.out.println("higherKey(100): "+map.higherKey(100)); 
		System.out.println("lowerEntry(105): "+map.lowerEntry(105)); 
		System.out.println("lowerKey(105): "+map.lowerKey(105)); 
	} 

} 