package com.raj.collection_framework.linked_hash_set;

import java.util.LinkedHashSet; 
public class LinkedHashSetDemo { 
 public static void main(String[] args) { 
   LinkedHashSet<String> lhs = new LinkedHashSet<>(); 
    
   lhs.add("Ravi"); 
   lhs.add("Vijay"); 
   lhs.add("Ravi"); 
   lhs.add("Ajay"); 
   lhs.add("Pawan"); 
   lhs.add("Shive"); 
   lhs.add(null); 
   lhs.add("Ganesh"); 
   lhs.forEach(str -> System.out.println(str)); 
 } 
} 