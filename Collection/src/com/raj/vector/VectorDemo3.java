package com.raj.vector;
import java.util.Collections; 
import java.util.Vector; 
//To work with Custom Object 
record Employee(Integer id, String name, Double salary) { 

} 

public class VectorDemo3 { 

	public static void main(String[] args) { 

		Vector<Employee> listOfEmployees = new Vector<>(); 
		listOfEmployees.add(new Employee(333,"Scott",800D)); 
		listOfEmployees.add(new Employee(555,"Smith",1200D)); 
		listOfEmployees.add(new Employee(111,"Martin",1500D)); 
		listOfEmployees.add(new Employee(222,"John",1800D)); 
		listOfEmployees.add(new Employee(444,"Allen",900D)); 

		System.out.println("Original Employee Data :"); 
		listOfEmployees.forEach(System.out::println); 

		System.out.println("Sorting Employee Data based on the Id: "); 

		Collections.sort(listOfEmployees,(e1,e2)->e1.id().compareTo(e2.id())); 

		System.out.println("Employee Data After sorting based on the Id : "); 
		listOfEmployees.forEach(System.out::println); 
	} 
} 