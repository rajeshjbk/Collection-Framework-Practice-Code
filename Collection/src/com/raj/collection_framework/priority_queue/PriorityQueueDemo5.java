package com.raj.collection_framework.priority_queue;

import java.util.PriorityQueue; 
import java.util.Scanner; 

public class PriorityQueueDemo5 { 

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in); 
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); //Min-Heap by default 
		int choice; 
		
		do { 
			System.out.println("\n*** PriorityQueue Menu ***"); 
			System.out.println("1. Insert element\n2. Remove head element (poll)\n3. View head element (peek)\n4. Display PriorityQueue\n5. Exit"); 
			System.out.print("Enter your choice: "); 
			choice = sc.nextInt(); 
			switch(choice) { 
			case 1:
				System.out.print("Enter element to insert: "); 
				int val = sc.nextInt(); 
				pq.add(val); 
				System.out.println(val+" inserted."); 
				break; 
				
			case 2: 
				if(pq.isEmpty()) { 
					System.out.println("PriorityQueue is empty!"); 
				}else { 
					System.out.println("Removed: "+pq.poll()); 
				} 
				break;
				
			case 3: 
				if(pq.isEmpty()) { 
					System.out.println("Priority is empty!"); 
				}else { 
					System.out.println("Head element: "+pq.peek()); 
				} 
				break; 
			case 4: 
				System.out.println("PriorityQueue: "+pq); 
				break; 
			case 5: 
				System.out.println("Exiting..."); 
				break; 
			default: 
				System.out.println("Invalid choice!"); 
			} 
		}while(choice != 5); 
	} 
} 