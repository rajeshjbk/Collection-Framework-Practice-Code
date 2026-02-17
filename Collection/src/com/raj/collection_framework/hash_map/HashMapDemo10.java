package com.raj.collection_framework.hash_map;
import java.util.Collections; 
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 

//Cheapest and expensive Flight 
public class HashMapDemo10 { 

	public static void main(String[] args) { 

		//Map<DestinationCity, Price> 

		Map<String, Integer> flights = new HashMap<>(); 

		flights.put("Mumbai", 5500); 
		flights.put("Bangalore", 7000); 
		flights.put("Chennai", 6500); 
		flights.put("Vizag", 5000); 
		flights.put("Pune", 5000); 
		flights.put("Goa", 8000); 
		flights.put("Kolkata", 8000); 

		//Cheapest Flight 

		Entry<String,Integer> min = Collections.min(flights.entrySet(), (f1,f2)-> 
		f1.getValue().compareTo(f2.getValue())); 
		System.out.println(min.getKey() +" : "+min.getValue()); 

		//Expensive Flight 
		int max = Collections.max(flights.values()); 

		for(Map.Entry<String, Integer> entry : flights.entrySet()) { 

			if(entry.getValue() == max) { 
				System.out.println("Expensive flight from Hyderabad to "+entry.getKey()+" price is : "+entry.getValue()); 
			} 
		} 
	} 
} 