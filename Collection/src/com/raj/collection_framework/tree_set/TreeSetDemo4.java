package com.raj.collection_framework.tree_set;

import java.util.TreeSet; 

record Employee1(Integer id, String name) { 

} 
public class TreeSetDemo4 { 
	
	public static void main(String[] args) { 

		TreeSet<Employee1> ts3 = new TreeSet<>((s1,s2) -> 
		s1.name().compareTo(s2.name())); 

		ts3.add(new Employee1(333,"Scott")); 
		ts3.add(new Employee1(111,"Zuber")); 
		ts3.add(new Employee1(222,"Aryan")); 

		ts3.forEach(System.out::println); 
	} 
} 