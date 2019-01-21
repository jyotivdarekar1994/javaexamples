package com.mindscripts.practice;

public class Array {
	
	public static void main(String[] args) {
		
		double marks[];
		marks=new double[5];
		
		for(int i=0; i<5;i++){
			marks[i]=50;
		}
		for(int i=0; i<5;i++){
			System.out.println(marks[i]);
		}
		System.out.println(marks);
	}

}
