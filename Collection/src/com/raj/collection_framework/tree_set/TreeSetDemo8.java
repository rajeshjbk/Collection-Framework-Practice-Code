package com.raj.collection_framework.tree_set;

import java.util.Comparator; 
import java.util.TreeSet; 
public class TreeSetDemo8 { 
	
	public static void main(String[] args) { 
		
		//Comparator that allows null 
		Comparator<String> nullFriendComparator = (s1,s2) ->{ 

			if(s1 == null && s2 == null) return 0;   // both null => equal 
			if(s1 == null) return -1;                // null is consider "smaller 
			if(s2 == null) return 1;                 // non-null is "greater" 
			return s1.compareTo(s2);                 // normal comparison 
		}; 

		TreeSet<String> set = new TreeSet<>(nullFriendComparator); 

		set.add("Banana"); 
		set.add(null); 
		set.add("Apple"); 
		set.add("Mango"); 

		System.out.println(set); 
	} 
} 