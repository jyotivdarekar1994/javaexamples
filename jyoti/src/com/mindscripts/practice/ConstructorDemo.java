package com.mindscripts.practice;

public class ConstructorDemo {
	
	private int id;
	private String name;
	private double salary;
	
	public ConstructorDemo(){
		
	}

	public ConstructorDemo(int i, String n, double s){
		this.id=i;
		this.name=n;
		this.salary=s;
		}
	public void print(){
		System.out.println("Employee Details");
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("salary="+salary);
	}
}
