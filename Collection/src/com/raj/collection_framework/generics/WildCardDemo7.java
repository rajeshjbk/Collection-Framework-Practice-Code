package com.raj.collection_framework.generics;

/* Generic Method 
   javac Test16.java 
   javap -c Test16.class [Disassemble the bytecode] 
 */ 

public class WildCardDemo7 { 
	
	public static void main(String[] args) { 

		Integer []intArr = {10,20,30,40,50}; 
		printArray(intArr); 
		System.out.println("...................."); 

		String []cities = {"Hyderabad","Banglore","Mumbai","Kolkata"}; 
		printArray(cities); 
	} 

	//Here T describes to the compiler that method with work for any T type 
	public static <T> void printArray(T[] array) { 

		for(T element : array) { 
			System.out.println(element); 
		} 
	} 
}