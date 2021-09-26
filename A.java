package practice;

import DataStructures.LinkedList;

class Student{
	private String studentName;
	private Integer rollno;
	
	//constructor
//	Student(String studentName,int rollno){
//		this.studentName=studentName;
//		this.rollno=rollno;
//	}
	
	
	//setter for student name
	public void setStudentName(String name) {
		this.studentName=name;
	}
	
	
	public void setRollNo(Integer number) {
		this.rollno=number;
	}
	
	//getters 
	public String getStudentName() {
		return this.studentName;
	}
	
	public Integer getRollNo() {
		return this.rollno;
	}
	
	public void study() {
		System.out.println(this.studentName+" is studying and his roll no is "+this.rollno);
	}
}

class Teacher{
	public void teach() {
		System.out.println("teacher is teaching");
	}
	
	
}

class Human{
	
}




public class A{
	public static void main(String[] args) {
		System.out.println("hello");
		
		Student s1 = new Student();
		s1.setStudentName("Madhu Gupta");
		s1.setRollNo(23);
		
		System.out.println("student name is " +s1.getStudentName()+" and roll no is "+s1.getRollNo());
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		
		list.showList();
		
		
		
	}
}