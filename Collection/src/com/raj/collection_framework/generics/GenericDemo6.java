package com.raj.collection_framework.generics;

//Mixing generic to non-generic  
import java.util.ArrayList; 

class Car{ 

	@Override 
	public String toString() { 
		return "Car []"; 

	} 
} 

public class GenericDemo6 { 

	public static void main(String[] args) { 

		ArrayList<Car> a = new ArrayList<>(); 
		a.add(new Car()); 
		a.add(new Car()); 
		a.add(new Car()); 

		ArrayList b = a;   //assigning Generic to row raw type 

		System.out.println(b); 
	} 
} 