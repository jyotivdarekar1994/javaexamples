package com.mindscripts.practice;

public class Student {
	private int rollNo;
	private String name;
	private double marks;
	private static String schoolname;
	private static int count;
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	} 
	

	public int getRollNo() {
		return this.rollNo;
	} 
	
	static{
		count=1;
		schoolname="Mind";
	}
	
	public Student(String n, double m ){
		this.rollNo=count++;
		this.name=n;
		this.marks=m;
	}
	public void print(){
		System.out.println("Student Details");
		System.out.println("roll_no="+rollNo);
		System.out.println("Name="+name);
		System.out.println("Marks="+marks);
		System.out.println(Student.schoolname);
	}
	
	
}
