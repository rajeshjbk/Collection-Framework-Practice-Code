package com.raj.collection_framework.ArrayList;
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.util.ArrayList; 
//Serialization + De-Serialization 
public class ArrayListDemo4 { 
	
	public static void main(String[] args) throws IOException { 
		
		ArrayList<String> listOfIceCream = new ArrayList<>(); 
		listOfIceCream.add("Vanila"); 
		listOfIceCream.add("Strwbarry"); 
		listOfIceCream.add("Butter Scotch"); 
		//Serialization 
		String filePath = "E:\\new\\IceCream.txt"; 
		var fos = new FileOutputStream(filePath); 
		var oos = new ObjectOutputStream(fos); 
		try(fos;oos){ 
			oos.writeObject(listOfIceCream); 
			System.out.println("Data Stored Successfully"); 
		}catch(Exception e) { 
			e.printStackTrace(); 
		} 
		//De-Serialization 
		var fin = new FileInputStream(filePath); 
		var ois = new ObjectInputStream(fin); 
		try(fin;ois){ 
			@SuppressWarnings("unchecked") 
			ArrayList<String> list = (ArrayList<String>)ois.readObject(); 

			System.out.println(list); 
		}catch(Exception e) { 
			e.printStackTrace(); 
		} 
	} 
} 
