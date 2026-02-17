package com.raj.collection_framework.tree_set;

import java.util.TreeSet; 

record Employee(Integer id, String name) implements Comparable<Employee>{ 
	
	@Override 
	public int compareTo(Employee e2) { 

		return Integer.compare(this.id(), e2.id()); 
	} 
} 

public class TreeSetDemo3 { 
	
	public static void main(String[] args) { 

		TreeSet<Employee> ts3 = new TreeSet<>(); 

		ts3.add(new Employee(333,"Scott")); 
		ts3.add(new Employee(111,"Zuber")); 
		ts3.add(new Employee(222,"Aryan")); 

		ts3.forEach(System.out::println); 
	} 
}