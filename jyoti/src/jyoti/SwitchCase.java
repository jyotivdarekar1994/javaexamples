package jyoti;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter value between 1-3");
		int x=scan.nextInt();
		
		
		switch(x){
		
		case 1:
			System.out.println("x is 1");
		
		          break;
		case 2:
			System.out.println("x is 2");
		       
		          break;
		case 3:
			System.out.println("x is 3");
		          
		          break;
		 default:
			 System.out.println("x is not equal to 1,2,3");
			 scan.close();
			 
		}
	}

}