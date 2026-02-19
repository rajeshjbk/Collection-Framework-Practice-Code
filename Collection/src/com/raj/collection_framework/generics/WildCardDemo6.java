package com.raj.collection_framework.generics;

class Fruit{  
	
} 

class Apple extends Fruit{ //Fruit is super, Apple is sub class 

	@Override 
	public String toString() { 
		return "Apple Fruit"; 
	}  
} 

class Basket<E>{ 
	
	private E element;    //E is type Fruit 

	public void setElement(E element) //Fruit element 

	{ 
		this.element = element; 
	} 

	public E getElement() { 

		return element; 
	} 
} 

public class WildCardDemo6 { 
	
	public static void main(String[] args) { 

		Basket<Fruit> basket = new Basket<>(); 
		basket.setElement(new Apple()); 
		Apple type = (Apple) basket.getElement(); 
		System.out.println(type); 
	} 
} 