	package com.mindscripts.practice;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args){
		
		int arr[]=new int[5];
		int small;
		int i;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the elements of array");
		for(i = 0; i<5; i++){
			arr[i]=scan.nextInt();
		}
		small=arr[0];
		for(i=0; i<5; i++){
			
			if(small>arr[i]){
				small=arr[i];
			}
	    }
		System.out.println("smallest element is"+small);
		scan.close();
	}
}