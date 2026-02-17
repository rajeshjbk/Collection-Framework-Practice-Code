package com.raj.collection_framework.linkedList;
import java.util.ArrayList; 
import java.util.LinkedList; 

public class LinkedListDemo1 {
	
	public static void main(String[] args) { 

		final int ITERATOR = 100000; 
		long startTime = System.currentTimeMillis(); 
		ArrayList<Integer> al = new ArrayList<>(); 
		for(int i=0; i<=ITERATOR; i++) { 
			al.add(0,i); 
		} 
		long endTime = System.currentTimeMillis(); 
		System.out.println("Time taken by ArrayList class : "+(endTime-startTime)+"ms"); 

		startTime = System.currentTimeMillis(); 
		LinkedList<Integer> list = new LinkedList<>(); 
		for(int i=0; i<=ITERATOR; i++) { 
			list.add(0,i); 
		} 
		endTime = System.currentTimeMillis(); 
		System.out.println("Time taken by LinkedList class : "+(endTime-startTime)+"ms"); 
	} 
} 