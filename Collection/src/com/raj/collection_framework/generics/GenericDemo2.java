package com.raj.collection_framework.generics;

import java.util.ArrayList; 

public class GenericDemo2 { 

	public static void main(String[] args) { 

		ArrayList al = new ArrayList();  //raw type 

		al.add(12); 
		al.add(15); 
		al.add(18); 
		al.add(22); 
		al.add(24); 

		for(int i=0; i<al.size(); i++) { 

			Integer x = (Integer) al.get(i); 
			System.out.println(x); 
		} 
	} 
} 