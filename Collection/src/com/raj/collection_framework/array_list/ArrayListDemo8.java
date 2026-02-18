package com.raj.collection_framework.array_list;
import java.util.ArrayList;

public class ArrayListDemo8 { 
	
	public static void main(String[] args) { 

		ArrayList<String> original = new ArrayList<>(); 
		original.add("BCA"); 
		original.add("MCA"); 
		original.add("BBA"); 

		System.out.println("By using clone Method"); 
		ArrayList<String> cloned = (ArrayList<String>) original.clone(); 
		System.out.println(cloned); 

		System.out.println("By using Copy Constructor"); 

		ArrayList<String> copy = new ArrayList<>(original); 
		System.out.println(copy); 
	} 
}