package com.raj.collection_framework.tree_map;

import java.util.TreeMap; 

record Product(Integer id, String name) { 

} 
public class TreeMapDemo3 { 

	public static void main(String[] args) { 

		TreeMap<Product,String> map = new TreeMap<>((p1,p2)->p1.id().compareTo(p2.id())); 

		map.put(new Product(222,"Mobile"),"Hyderabad"); 
		map.put(new Product(333,"Camera"),"Pune"); 
		map.put(new Product(111,"Laptop"),"Chennai"); 

		System.out.println(map); 
	} 
} 