package com.raj.collection_framework.hash_set;
import java.util.LinkedList; 
import java.util.ListIterator;

public class CursorMovement { 

	public static void main(String[] args) { 

		LinkedList<String> list = new LinkedList<>(); 
		list.add("A"); 
		list.add("B"); 
		list.add("C"); 
		list.add("D"); 
		//Start ListIterator from index 0 
		ListIterator<String> it = list.listIterator(); 


		System.out.println("Forward Traversal: "); 
		while(it.hasNext()) { 

			int nextIndex = it.nextIndex(); 
			String value = it.next(); 
			System.out.println("Index "+nextIndex +" -> "+value); 
		} 
		System.out.println("Backward Traversal: "); 
		while(it.hasPrevious()) { 
			int preIndex = it.previousIndex(); 
			String value = it.previous(); 
			System.out.println("Index "+preIndex+" -> "+value); 
		} 

		System.out.println("\nStart Iterator from index 2: "); 
		ListIterator<String> it2 = list.listIterator(2); 
		while(it2.hasNext()) { 

			int nextIndex = it2.nextIndex(); 
			String value = it2.next(); 
			System.out.println("Index "+nextIndex +" -> "+value); 
		} 
	} 
} 