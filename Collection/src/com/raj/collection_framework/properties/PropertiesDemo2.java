package com.raj.collection_framework.properties;

import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Properties; 

public class PropertiesDemo2 { 

	public static void main(String[] args) throws IOException { 

		Properties properties = new Properties(); 

		String filePath = "E:\\CoreJava\\bookdata.properties"; 

		var writer = new FileWriter(filePath); 
		try(writer) { 

			properties.setProperty("book","java"); 
			properties.setProperty("author","James"); 
			properties.setProperty("price","1200"); 

			properties.store(writer, "Book Properties set"); 

		}catch(Exception e) { 
			e.printStackTrace(); 
		} 

		//Reading the data from Properties file 
		var reader = new FileReader(filePath); 
		try(reader){ 
			properties.load(reader); 
			System.out.println("Book Name is "+properties.getProperty("book")); 
			System.out.println("Author Name is "+properties.getProperty("author")); 
			System.out.println("Price Name is "+properties.getProperty("price")); 
		}catch(Exception e) { 
			e.printStackTrace(); 
		} 
	} 
}