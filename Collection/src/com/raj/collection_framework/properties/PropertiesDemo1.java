package com.raj.collection_framework.properties;

import java.io.FileReader; 
 
import java.util.Properties; 

public class PropertiesDemo1 { 

	public static void main(String[] args) throws Exception { 

		FileReader fr = new FileReader("E:\\CoreJava\\db.properties"); 
		Properties prop = new Properties(); 
		prop.load(fr); 

		String driver = prop.getProperty("driver"); 
		System.out.println(driver); 
		String user = prop.getProperty("user"); 
		System.out.println(user); 
		String pwd = prop.getProperty("password"); 
		System.out.println(pwd); 
	} 
} 