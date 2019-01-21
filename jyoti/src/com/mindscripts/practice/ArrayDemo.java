package com.mindscripts.practice;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("enter elements in array");
			arr[i]=scan.nextInt();
			
		}
		System.out.print("Entered Elements are");
		for(int i = 0; i<5;i++){
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
