package com.raj.collection_framework.vector;

import java.util.Iterator; 
import java.util.Vector;

class Concurrent extends Thread{ 
	
	private Vector<String> cities; 
	
	public Concurrent(Vector<String> cities) { 
		super(); 
		this.cities = cities; 
	} 
	@Override 
	public void run() { 
		try { 
			Thread.sleep(2000); 
		}catch(InterruptedException e) { 
			System.out.println("Thread is interrupted"); 
		} 
		cities.add("GOA"); 
	} 
} 

public class FailFastIterator { 

	public static void main(String[] args) throws InterruptedException { 

		Vector<String> listOfCity = new Vector<>(); 

		listOfCity.add("Hyderabad"); 
		listOfCity.add("Pune"); 
		listOfCity.add("Indore"); 
		listOfCity.add("Bhubneswar"); 
		listOfCity.add("Kolkata"); 
		listOfCity.add("Chennai"); 

		Concurrent concurrent = new Concurrent(listOfCity); 
		concurrent.start(); 

		Iterator<String> iterator = listOfCity.iterator(); 

		while(iterator.hasNext()) { 
			System.out.println(iterator.next()); 
			Thread.sleep(500); 
		} 
	} 
}