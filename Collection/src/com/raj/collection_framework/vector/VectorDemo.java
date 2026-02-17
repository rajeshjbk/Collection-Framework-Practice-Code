package com.raj.collection_framework.vector;

import java.util.Collections; 

import java.util.Vector; 
public class VectorDemo { 
	
	public static void main(String[] args) { 

		Vector<String> listOfCity = new Vector<>(); 

		listOfCity.add("Hyderabad"); 
		listOfCity.add("Pune"); 
		listOfCity.add("Indore"); 
		listOfCity.add("Bhubneswar"); 
		listOfCity.add("Kolkata"); 
		System.out.println("Before Sorting : "+listOfCity); 

		System.out.println("Sorting the city Name in Ascending Order :"); 

		//       Collections.sort(listOfCity);    [Old technique] 
		//       System.out.println(listOfCity); 

		listOfCity.sort((s1,s2)->s1.compareTo(s2));  //[New Technique] 
		System.out.println(listOfCity); 


		System.out.println("Remove the element using object : "); 
		listOfCity.remove("Pune"); 
		System.out.println(listOfCity); 
	} 
}