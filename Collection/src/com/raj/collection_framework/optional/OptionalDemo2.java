package com.raj.collection_framework.optional;

import java.util.Optional; 

public class OptionalDemo2 { 

	public static void main(String[] args) { 

		Integer i = null; 

		Optional<Integer> container = Optional.ofNullable(i); 
		System.out.println("Value in the container: "+container.get()); 
	} 
}