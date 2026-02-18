package com.raj.collection_framework.array_list;

import java.util.Arrays; 
import java.util.List; 
public class FixedLengthArray { 
 public static void main(String[] args) { 
   
  List<Integer> fixedLengthArray = Arrays.asList(1,2,3,4,5); 
  fixedLengthArray.forEach(System.out::println); 
  System.out.println(".........................."); 
   
  //fixedLengthArray.add(6);  //java.lang.UnsupportedOperationException 
  //fixedLengthArray.remove(0); //java.lang.UnsupportedOperationException 
  fixedLengthArray.set(0, 100); 
  fixedLengthArray.forEach(System.out::println); 
 } 
} 