package com.raj.collection_framework.array_list;

import java.util.ArrayList; 
import java.util.Collections; 
//Sort Customer based on their Name

record Customer(Integer custId, String custName, Double custSal) implements 
Comparable<Customer>{ 
	@Override 
	public int compareTo(Customer c2) { 
		return this.custName.compareTo(c2.custName); 
	} 
} 

public class ArrayListDemo1 { 
	public static void main(String[] args) { 

		ArrayList<Customer> listOfCustomer = new ArrayList<>(); 

		listOfCustomer.add(new Customer(111, "Scott", 800D)); 
		listOfCustomer.add(new Customer(222, "Smith", 1200D)); 
		listOfCustomer.add(new Customer(333, "Alen", 1800D)); 
		listOfCustomer.add(new Customer(444, "Martin", 1500D)); 
		listOfCustomer.add(new Customer(555, "John", 1300D)); 

		System.out.println("Original Customer object: "); 
		listOfCustomer.forEach(System.out::println); 

		Collections.sort(listOfCustomer); 
		System.out.println("Sorted based on the name: "); 
		listOfCustomer.forEach(System.out::println); 
	} 
} 