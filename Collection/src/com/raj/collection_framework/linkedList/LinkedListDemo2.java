package com.raj.collection_framework.linkedList;
import java.util.Arrays; 
import java.util.LinkedList; 
import java.util.List; 

public class LinkedListDemo2 { 
	
	public static void main(String[] args) { 

		LinkedList<String> list = new LinkedList<>(); 

		list.addFirst("Ravi");   
		list.add("Rahul"); 
		list.addLast("Anand"); 

		System.out.println(list.getFirst()); 
		System.out.println(list.getLast()); 

		list.removeFirst(); 
		list.removeLast(); 


		System.out.println(list);   //Rahul 

		System.out.println("..................................."); 

		List<String> listOfName = Arrays.asList("Ravi","Rahul","Ankit","Rahul"); 

		LinkedList<String> names = new LinkedList<>(listOfName); 
		names.forEach(System.out::println); 
	} 

} 