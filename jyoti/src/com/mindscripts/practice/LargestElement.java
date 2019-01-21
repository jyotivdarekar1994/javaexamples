package com.mindscripts.practice;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		
		int a[]=new int [6];
		int large;
		int i;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for( i = 0; i < 6; i++){
			a[i]=scan.nextInt();
		}
		large=a[0];
		for(i = 0; i < 6; i++){
			
			if(large<a[i]){
				large=a[i];
			}
			}
		System.out.println("Largest Element in The array is ="+large);
		scan.close();
	}

}
 