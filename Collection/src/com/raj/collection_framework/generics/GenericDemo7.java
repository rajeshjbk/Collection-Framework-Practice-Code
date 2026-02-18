package com.raj.collection_framework.generics;

//Mixing generic to non-generic  
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.List; 

class  UnknownClass{ 

	public int addValues(List list) {  //generic to raw type OR 

		Iterator it = list.iterator(); 
		int total = 0; 

		while(it.hasNext()) { 

			int i =((Integer)it.next()); 
			total += i;      //total = 15 
		} 
		return total; 
	} 
} 

public class GenericDemo7 { 

	public static void main(String[] args) { 
		List<Integer> myList = new ArrayList<>(); 

		myList.add(4); 
		myList.add(6); 
		myList.add(5); 
		UnknownClass u = new UnknownClass();  
		int total = u.addValues(myList); 

		System.out.println("The sum of Integer Object is : "+total); 
	} 
} 