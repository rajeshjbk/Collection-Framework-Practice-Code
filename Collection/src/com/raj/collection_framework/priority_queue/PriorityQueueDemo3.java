package com.raj.collection_framework.priority_queue;

import java.util.Collections; 
import java.util.PriorityQueue; 

public class PriorityQueueDemo3 {
	
	public static void main(String[] args) { 

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); 

		maxHeap.add(15); 
		maxHeap.add(3); 
		maxHeap.add(25); 

		while(!maxHeap.isEmpty()) { 
			System.out.println(maxHeap.poll()); 
		} 
	} 
} 