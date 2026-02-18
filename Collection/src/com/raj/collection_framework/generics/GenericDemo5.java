package com.raj.collection_framework.generics;

//Program  that describes the return type of any method 
//can be type safe [we can apply generics on method return type] 

import java.util.ArrayList; 
import java.util.List; 
class Dog{ 
	public List<Dog> getDogList(){ 
		ArrayList<Dog>  d = new ArrayList<>(); 
		d.add(new Dog()); 
		d.add(new Dog()); 
		d.add(new Dog()); 

		return d; 
	} 

	@Override 
	public String toString() { 
		return "Dog []"; 
	} 
} 

public class GenericDemo5 { 
	
	public static void main(String[] args) { 

		Dog d1 = new Dog(); 
		Dog d2 = d1.getDogList().get(0); 
		System.out.println(d2); 
	} 
}