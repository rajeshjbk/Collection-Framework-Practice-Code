package com.raj.collection_framework.optional;

import java.util.Optional; 

class Employee{ 
	
	private Integer id; 
	private String name; 
	
	public Employee() { 
		super(); 
	} 
	
	public Employee(Integer id,String name){ 
		super(); 
		this.id = id; 
		this.name = name; 
	} 
	
	//New getter style from JDK 1.8V 
	public Optional<Integer> getId(){ 
		return Optional.ofNullable(id); 
	}
	
	public Optional<String> getName(){ 
		return Optional.ofNullable(name); 
	} 
	
	@Override 
	public String toString() { 
		return "Employee [id=" + id + ", name=" + name + "]"; 
	} 
} 

public class OptionalDemo4 { 
	
	public static void main(String[] args) { 
		
		Employee e1 = new Employee(); 
		e1 = new Employee(111,"Scott"); 
		Optional<String> name = e1.getName(); 
		System.out.println(name.orElse("Name is not available")); 

		Optional<Integer> id = e1.getId(); 
		id.ifPresent(System.out::println); 
	} 
}