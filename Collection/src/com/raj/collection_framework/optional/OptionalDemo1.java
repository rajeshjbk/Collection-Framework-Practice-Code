package com.raj.collection_framework.optional;

import java.util.Optional; 

public class OptionalDemo1 { 
	
	public static void main(String[] args) { 

		String str = null; 

		Optional<String> container = Optional.ofNullable(str); 

		if(container.isPresent()) { 
			System.out.println("Value in the container : "+container.get()); 
		}else { 
			System.err.println("No Value in the container."); 
		} 
	} 
} 