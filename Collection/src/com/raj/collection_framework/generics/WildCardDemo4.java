package com.raj.collection_framework.generics;
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 

class BoundExample{ 

	public static void printNumber(List<? extends Number> list) { 

		for(Number n : list) { 
			System.out.println(n); 
		} 
	} 

	public static void addNumbers(List<? super Integer> list) { 

		list.add(100); 
		list.add(200); 
		list.add(300); 
	} 
} 

public class WildCardDemo4 { 
	
	public static void main(String[] args) { 

		//Upper Bound 
		List<Integer> intList = Arrays.asList(10,20,30); 

		List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5); 

		System.out.println("Priting Integers: "); 
		BoundExample.printNumber(intList); 

		System.out.println("Priting Doubles: "); 
		BoundExample.printNumber(doubleList); 

		/* List<Character> charList = Arrays.asList('A','B','C'); 
           System.out.println("Priting Characters: "); 
           BoundExample.printNumber(charList); */ 

		System.out.println(".............................."); 

		List<Number> numList = new ArrayList<>(); 
		BoundExample.addNumbers(numList); 
		System.out.println("Numbers after adding: "+numList); 

		List<Object> objList = new ArrayList<>(); 
		BoundExample.addNumbers(objList); 
		System.out.println("Object after adding: "+objList); 
	} 
}