package com.raj.collection_framework.weak_hash_map;

import java.util.WeakHashMap; 

record Product(Integer id, String name, Double price) { 

	@Override 
	public void finalize() { 
		System.out.println("Product Object is eligible for GC"); 
	} 
} 

public class WeakHashMapDemo { 

	public static void main(String[] args) { 

		Product p1 = new Product(111,"Laptop",96000D); 

		WeakHashMap<Product,String> map = new WeakHashMap<>(); 
		map.put(p1, "Hyd"); 

		System.out.println(map); 

		p1 = null; 
		System.gc(); 


		try { 
			
			Thread.sleep(5000); 
			
		}catch(InterruptedException e) { 
			
			e.printStackTrace(); 
		} 

		System.out.println(map); //{} 
	} 
}