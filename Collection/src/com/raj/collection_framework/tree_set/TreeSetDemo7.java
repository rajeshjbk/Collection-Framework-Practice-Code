package com.raj.collection_framework.tree_set;

import java.util.TreeSet; 

record Product(Integer id, String name, Double price) { 

} 
public class TreeSetDemo7 { 
	
	public static void main(String[] args) { 

		TreeSet<Product> ts1 = new TreeSet<>((p1,p2)->Integer.compare(p1.id(),p2.id())); 

		ts1.add(new Product(333,"Mobile",56789D)); 
		ts1.add(new Product(333,"Laptop",46789D)); 
		ts1.add(new Product(333,"Camera",96789D)); 

		System.out.println("Sorting based on Id: "); 
		ts1.forEach(System.out::println); 

		System.out.println("..........................................."); 
		TreeSet<Product> ts2 = new TreeSet<>((p1,p2)->Double.compare(p1.price(),p2.price())); 

		ts2.add(new Product(333,"Mobile",56789D)); 
		ts2.add(new Product(333,"Laptop",46789D)); 
		ts2.add(new Product(333,"Camera",96789D)); 

		System.out.println("Sorting based on Price: "); 
		ts2.forEach(System.out::println);  
	} 
} 