package com.raj.collection_framework.sorted_map_methods;

import java.util.SortedMap; 
import java.util.TreeMap; 

public class SortedMapMethodDemo { 

	public static void main(String[] args) { 

		SortedMap<Integer, String> map = new TreeMap<>(); 

		map.put(100, "Amit"); 
		map.put(101, "Ravi"); 

		map.put(102, "Raj"); 
		map.put(103, "PreetiL...."); 

		System.out.println("First Key : "+map.firstKey());  //100 
		System.out.println("Last Key : "+map.lastKey());    //103 

		System.out.println("headMap : "+map.headMap(102));  //100 101 
		System.out.println("tailMap : "+map.tailMap(102));  //102 103 

		System.out.println("subMap : "+map.subMap(100, 102));  //100 101 

	} 
}