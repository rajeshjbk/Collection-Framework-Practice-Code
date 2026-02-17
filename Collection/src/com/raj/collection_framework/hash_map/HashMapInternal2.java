package com.raj.collection_framework.hash_map;
import java.util.HashMap;

//perfect for HashMap key 
record Customer1(Integer id, String name) { 


} 
public class HashMapInternal2 { 
	public static void main(String[] args) { 

		Customer1 c1 = new Customer1(111, "Scott"); 
		Customer1 c2 = new Customer1(111, "Scott"); 

		System.out.println(c1.hashCode() +" : "+c2.hashCode()); 
		System.out.println(c1.equals(c2)); 
		System.out.println("......................"); 

		HashMap<Customer1,String> map = new  HashMap<>();  
		map.put(c1, "A"); 
		map.put(c2, "B"); 

		System.out.println(map.size()); 
		System.out.println(map); 
	} 
} 