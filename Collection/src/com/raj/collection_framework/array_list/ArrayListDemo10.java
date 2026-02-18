package com.raj.collection_framework.array_list;

import java.util.ArrayList; 

public class ArrayListDemo10 { 
	
	public static void main(String[] args) { 

		ArrayList<String> list = new ArrayList<>(100); 
		list.add("Java"); 
		list.add("World"); 

		//public void trimToSize() 
		list.trimToSize(); 
		System.out.println("Trimmed List Size: "+list.size()); 

		System.out.println("............................."); 

		ArrayList<Integer> listOfNumbetr = new ArrayList<>(); 

		//public void ensureCapacity(int minCapacity) 
		//Increase the Capacity of the ArrayList to avoid frequent resizing. 
		listOfNumbetr.add(999); 

		listOfNumbetr.ensureCapacity(100); 

		for(int i=0; i<50; i++) { 

			listOfNumbetr.add(i); 
		} 
		System.out.println("List size: "+listOfNumbetr.size()); 
	} 
}