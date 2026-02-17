package com.raj.collection_framework.hash_set;

import java.util.HashSet; 
import java.util.Scanner; 

public class HashSetDemo4 { 
	
	public static void main(String[] args) { 

		HashSet<String> hashSet = new HashSet<>(); 
		Scanner sc = new Scanner(System.in); 

		while(true) { 
			System.out.println("Options:"); 
			System.out.println("1. Add element"); 
			System.out.println("2. Delete element"); 
			System.out.println("3. Display HashSet"); 
			System.out.println("4. Exit"); 

			System.out.print("Enter your choice(1/2/3/4): "); 
			int choice = Integer.parseInt(sc.nextLine()); 

			switch(choice) { 
			case 1: 
				System.out.print("Enter the element to add: "); 
				String elementToAdd = sc.nextLine(); 

				if(hashSet.add(elementToAdd)) { 
					System.out.println("Element added successfully."); 
				}else { 
					System.out.println("Element already exists in the HashSet."); 
				} 
				break; 
			case 2: 
				System.out.print("Enter the element to delete: "); 

				String elementToDelete = sc.nextLine(); 

				if(hashSet.remove(elementToDelete)) { 
					System.out.println("Element deleted successfully."); 
				}else { 
					System.out.println("Element not found in the HashSet."); 
				} 
				break; 
			case 3:   
				System.out.println("Element in the HashSet: "); 
				hashSet.forEach(System.out::println); 
				break; 
			case 4: 
				System.out.println("Exiting the Program."); 
				System.exit(0); 

			default: 
				System.out.println("Invalid choice, Please try again.");     
			} 
			System.out.println(); 
		} 
	} 
}