package com.raj.collection_framework.generics;
import java.util.ArrayList; 
class Animal2{  
} 
class Dog1 extends Animal2{ 
} 
class Horse extends Animal2{ 
} 
public class WildCardDemo1 { 
 
 public static void main(String[] args) { 
   
  ArrayList<? super Dog1> list = new ArrayList<Object>();    
  list.add(new Dog1()); 
   
  ArrayList<? extends Animal2> list1 = new ArrayList<Horse>();   
 // list1.add(new Horse());  //error [Not allowed] 
 } 
}