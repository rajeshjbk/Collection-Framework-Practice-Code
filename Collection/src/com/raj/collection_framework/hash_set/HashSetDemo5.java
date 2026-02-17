package com.raj.collection_framework.hash_set;

import java.util.HashSet; 

public class HashSetDemo5 { 
	
 public static void main(String[] args) { 
   
     HashSet<String> hs1 = new HashSet<String>(); 
     hs1.add(new String("India")); 
     hs1.add(new String("India")); 
     System.out.println(hs1.size());//1 
      
     HashSet<StringBuffer> hs2 = new HashSet<StringBuffer>(); 
     hs2.add(new StringBuffer("Hyd")); 
     hs2.add(new StringBuffer("Hyd")); 
     System.out.println(hs2.size()); //2      
 } 
}