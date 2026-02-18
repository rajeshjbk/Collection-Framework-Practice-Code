package com.raj.collection_framework.optional;

import java.util.Optional; 

public class OptionalDemo3 { 
	public static void main(String[] args) { 

		String str = null; 
		Optional<String> container = Optional.ofNullable(str); 

		String  orElse = container.orElse("No Value in the container."); 

		System.out.println(orElse); 
	} 
} 