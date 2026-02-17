package com.raj.collection_framework.linkedList;
import java.util.LinkedList; 
import java.util.List; 
import java.util.Scanner; 

public class LinkedListDemo4 { 
	public static void main(String[] args) { 


		List<Integer> linkedList= new LinkedList<>(); 
		Scanner sc = new Scanner(System.in); 
		while(true) { 
			System.out.println("LinkedList : "+linkedList); //[] 
			System.out.println("1. Insert  Element"); 
			System.out.println("2. Delete Element"); 
			System.out.println("3. Display Element"); 
			System.out.println("4. Exit"); 

			System.out.print("Enter your choice: "); 

			int choice = Integer.parseInt(sc.nextLine()); 

			switch(choice) { 

			case 1: 
				System.out.print("Enter the element to insert: "); 
				int elementToAdd = Integer.parseInt(sc.nextLine()); 
				linkedList.add(elementToAdd); 
				break; 
			case 2: 
				if(linkedList.isEmpty()) { 
					System.out.println("Linked list is empty. Nothing to delete."); 
				}else { 
					System.out.println("Enter the element to delete: "); 
					int elementToDelete = Integer.parseInt(sc.nextLine()); 

					boolean remove = 
							linkedList.remove(Integer.valueOf(elementToDelete)); 

					if(remove) { 
						System.out.println("Element "+elementToDelete+" is deleted Successfully."); 

					}else { 


						System.out.println("Element "+ elementToDelete+" not available is the LinkedList"); 
					} 
				} 
				break; 
			case 3: 
				System.out.println("Elements in the linked list."); 
				linkedList.forEach(System.out::println); 
				break; 
			case 4: 
				System.out.println("Exiting the program."); 
				System.exit(0); 
			default: 
				System.out.println("Invalid choice. Please try again.");     
			} 
		} 
	} 
} 