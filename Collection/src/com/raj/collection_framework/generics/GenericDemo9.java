package com.raj.collection_framework.generics;

// polymorphism with Array and Generics: 
import java.util.*; 

abstract class Animal{ 
	public abstract void checkup(); 
} 

class Dogs extends Animal{ 
	@Override 
	public void checkup() { 
		System.out.println("Dog checkup"); 
	} 
} 

class Cat extends Animal{ 
	@Override 
	public void checkup() { 

		System.out.println("Cat checkup"); 
	} 
} 

class Bird extends Animal{ 
	@Override 
	public void checkup() {  
		System.out.println("Cat checkup"); 
	} 
} 

public class GenericDemo9 { 

	public static void checkAnimals(Animal ...animals) { 

		for(Animal animal : animals) { 
			animal.checkup(); 
		} 
	} 

	public static void main(String[] args) { 

		Dogs []dogs = {new Dogs(), new Dogs()}; 
		Cat []cats = {new Cat(), new Cat(), new Cat()}; 
		Bird []birds = {new Bird(),new Bird()}; 

		checkAnimals(dogs); 
		checkAnimals(cats); 
		checkAnimals(birds);  
	} 
} 