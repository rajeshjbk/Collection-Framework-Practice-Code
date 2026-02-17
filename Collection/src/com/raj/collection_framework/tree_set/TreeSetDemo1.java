package com.raj.collection_framework.tree_set;

import java.util.TreeSet; 

public class TreeSetDemo1 { 

	public static void main(String[] args) { 

		TreeSet<Object> ts1 = new TreeSet<>(); 

		ts1.add(78); 
		ts1.add(15); 
		ts1.add(34); 
		ts1.add(78); 
		ts1.add(67); 
		ts1.add(90); 
		//  ts1.add("Nit");  //java.lang.ClassCastException 
		//  ts1.add(null);   //java.lang.NullPointerException 

		System.out.println(ts1); 
	} 
} 