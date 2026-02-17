package com.raj.collection_framework.tree_set;

import java.util.TreeSet; 

public class TreeSetDemo5 { 
	
	public static void main(String[] args) { 

		TreeSet<StringBuffer> ts1 = new TreeSet<>(); 
		ts1.add(new StringBuffer("B")); 
		ts1.add(new StringBuffer("A")); 
		ts1.add(new StringBuffer("C")); 

		System.out.println(ts1); 

		TreeSet<StringBuilder> ts2 = new TreeSet<>(); 
		ts2.add(new StringBuilder("B")); 
		ts2.add(new StringBuilder("A")); 
		ts2.add(new StringBuilder("C")); 

		System.out.println(ts2); 
	} 
}