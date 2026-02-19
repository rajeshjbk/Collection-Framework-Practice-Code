package com.raj.collection_framework.generics;

import java.util.ArrayList; 
import java.util.Arrays; 


public class GenericDemo11 { 

	public static void main(String[] args) { 

		/* ArrayList<Object> al = new ArrayList<String>();  [Compile time] 
  ArrayList al = new ArrayList(); [Runtime, Type Erasure] 
    al.add(true);  */ 

		Object []obj = new String[3];  //valid with Array 
		obj[0] = "Ravi"; 
		obj[1] = "hyd"; 
		obj[2] = 90;   //java.lang.ArrayStoreException 
		System.out.println(Arrays.toString(obj)); 
	} 
}