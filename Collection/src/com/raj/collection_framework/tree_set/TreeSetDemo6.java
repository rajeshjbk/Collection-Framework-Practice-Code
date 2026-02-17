package com.raj.collection_framework.tree_set;

import java.util.ArrayList; 
import java.util.TreeSet; 

public class TreeSetDemo6 { 
	
	public static void main(String[] args) { 

		TreeSet<Character> ts1 = new TreeSet<>(); 

		ts1.add('C'); 
		ts1.add('B'); 
		ts1.add('A'); 

		System.out.println(ts1); 

		TreeSet<Character> ts2 = new TreeSet<>(ts1); 
		System.out.println(ts2); 

		System.out.println(".................."); 

		ArrayList<String> listOfCity = new ArrayList<>(); 

		listOfCity.add("Hyderabad"); 
		listOfCity.add("Hyderabad"); 
		listOfCity.add("Pune"); 
		listOfCity.add("Mumbai"); 
		listOfCity.add("Ajmer"); 
		listOfCity.add("Surat"); 

		TreeSet<String> cities = new TreeSet<String>(listOfCity); 
		System.out.println(cities); 
	} 
} 