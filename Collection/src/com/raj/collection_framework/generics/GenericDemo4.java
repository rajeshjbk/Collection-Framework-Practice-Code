package com.raj.collection_framework.generics;


import java.util.ArrayList; 
public class GenericDemo4 {  
	
	public static void main(String[] args) { 

		ArrayList<String> al = new ArrayList<>(); //Generic  type 

		al.add("Ravi"); 
		al.add("Ajay"); 
		al.add("Vijay"); 

		for(int i=0; i<al.size(); i++) { 

			String name = al.get(i);   //no type casting requires 
			System.out.println(name.toUpperCase()); 
		} 
	} 
} 	