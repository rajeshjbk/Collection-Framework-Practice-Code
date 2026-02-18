package com.raj.collection_framework.array_list;
import java.util.ArrayList; 
import java.util.List; 
record Professor(String name, String specialization) { 

} 

class Department{ 

	private String departmentName; 
	private List<Professor> professors; 

	public Department(String departmentName) { 
		this.departmentName = departmentName; 
		professors = new ArrayList<Professor>();  //Composition 
	} 
	public void addProfessor(Professor professor) { 
		professors.add(professor); 
	} 
	public String getDepartmentName() { 
		return this.departmentName; 
	} 
	public List<Professor> getProfessors(){ 
		return this.professors; 
	} 
} 
public class ArrayListDemo7 { 

	public static void main(String[] args) { 

		Department dept = new Department("Computer science"); 
		dept.addProfessor(new Professor("Mr James", "Java")); 
		dept.addProfessor(new Professor("Mr Scott", "Python")); 
		dept.addProfessor(new Professor("Mr Magic", "AI")); 
		System.out.println("The professors which are in: "+dept.getDepartmentName()+" department"); 
		dept.getProfessors().forEach(System.out::println); 

		Department civil = new Department("Civil Engineering"); 
		civil.addProfessor(new Professor("Mr Alen", "Engineering Drawing")); 
		civil.addProfessor(new Professor("Mr John", "UML")); 
		civil.addProfessor(new Professor("Mr Raj", "Drawing")); 

		System.out.println("The professors which are in : "+civil.getDepartmentName()+" department"); 
		civil.getProfessors().forEach(System.out::println); 
	} 
}