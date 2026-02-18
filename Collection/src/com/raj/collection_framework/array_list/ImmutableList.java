package com.raj.collection_framework.array_list;

import java.util.List; 
public class ImmutableList { 
	
 public static void main(String[] args) { 
   
  List<Integer> immutableList = List.of(1,2,3,4,5,6,7,8,9,10,11); 
  immutableList.forEach(System.out::println); 
   
  // immutableList.add(12);// java.lang.UnsupportedOperationException 
 //  immutableList.remove(0);// java.lang.UnsupportedOperationException 
 // immutableList.set(0, 100);// java.lang.UnsupportedOperationException 
 
 } 
}
