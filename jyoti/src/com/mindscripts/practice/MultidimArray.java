package com.mindscripts.practice;

import java.util.Scanner;

public class MultidimArray {
	public static void main(String[] args) {
		/*int i=0;
		int j=0;*/
		int arr[][]=new int[3][3];
		
		Scanner scan=new Scanner(System.in);
		
		
		
		for( int i = 0; i < arr.length; i++){
			
			for( int j = 0; j< arr.length; j++){
				System.out.println("enter elements in array");
				arr[i][j]=scan.nextInt();
				
		}
			}
		System.out.println("Entered Elements are");
		for(int i = 0; i<arr.length;i++){
			for(int j = 0; j< arr.length; j++){
				System.out.print(arr[i][j] +" ");	
			}
			System.out.println( " " );
		}
		scan.close();
	}


}
