package com.raj.collection_framework.tree_set;

import java.util.Iterator; 
import java.util.TreeSet; 

public class TreeSetDemo2 { 
	
	public static void main(String[] args) { 

		TreeSet<String> ts2 = new TreeSet<>(); 

		ts2.add("Mango"); 
		ts2.add("Grapes"); 
		ts2.add("Apple"); 
		ts2.add("Orange"); 


		System.out.println("In Ascending Order: "); 
		ts2.forEach(System.out::println); 

		System.out.println("\nIn Descending order: "); 
		Iterator<String> descItr = ts2.descendingIterator(); 
		descItr.forEachRemaining(System.out::println); 
	
	} 
} 