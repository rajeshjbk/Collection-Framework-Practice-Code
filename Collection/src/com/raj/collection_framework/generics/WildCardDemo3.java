package com.raj.collection_framework.generics;
import java.util.ArrayList; 
import java.util.ArrayList; 
import java.util.List; 

class Alpha{  
} 
class Beta extends Alpha{  
} 
class Gamma extends Beta{  
}  

public class WildCardDemo3 { 
	
	public static void main(String[] args) { 

		List<? extends Number> list1 = new ArrayList<Float>(); 
		List<? super String> list2 = new ArrayList<Object>(); 
		List<? super Gamma> list3 = new ArrayList<Beta>(); 


		List list4 = new ArrayList(); 

		System.out.println("yes"); 
	} 
}