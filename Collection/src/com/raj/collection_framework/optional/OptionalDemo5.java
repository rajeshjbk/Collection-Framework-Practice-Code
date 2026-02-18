package com.raj.collection_framework.optional;

import java.util.ArrayList; 
import java.util.Optional; 

public class OptionalDemo5 { 

	public static void main(String[] args) { 

		ArrayList<Optional<String>> listOfCity = new ArrayList<>(); 

		listOfCity.add(Optional.of("Hyd")); 
		listOfCity.add(Optional.of("Pune")); 
		listOfCity.add(Optional.of("Indore")); 
		listOfCity.add(Optional.of("Chennai")); 
		listOfCity.add(Optional.empty()); 

		for(Optional<String> optn1 : listOfCity) { 
			
			if(optn1.isPresent()) { 
				
				System.out.println(optn1.get()); 
				
			}else { 
				
				System.err.println("Value is not available"); 
			} 
		} 
	} 
}