package com.raj.collection_framework.generics;
//polymorphism with Array and Generics: 

import java.util.*; 
abstract class Animal1{  
	public abstract void checkup(); 
} 
class Dogs1 extends Animal1{ 
	@Override 
	public void checkup() { 
		System.out.println("Dog checkup"); 
	} 
} 
class Cat1 extends Animal1{ 
	@Override 
	public void checkup() { 
		System.out.println("Cat checkup"); 
	} 
} 
class Bird1 extends Animal1{ 
	@Override 
	public void checkup() {  
		System.out.println("Cat checkup"); 
	} 
} 
public class GenericDemo10 { 
	
	public static void checkAnimals(List<Animal1> animals) { 
		
		for(Animal1 animal : animals) { 
			animal.checkup(); 
		} 
	} 
	public static void main(String[] args) { 
		List<Dogs1> dogs = new ArrayList<>(); 

		dogs.add(new Dogs1()); 
		dogs.add(new Dogs1()); 

		List<Cat1> cats = new ArrayList<>(); 
		cats.add(new Cat1()); 
		cats.add(new Cat1()); 

		List<Bird1> birds = new ArrayList<>(); 
		birds.add(new Bird1()); 
		birds.add(new Bird1()); 

		GenericDemo10 t = new GenericDemo10(); 
		
		/*t.checkAnimals(dogs); 
		t.checkAnimals(cats); 
		t.checkAnimals(birds); */
	} 
} 