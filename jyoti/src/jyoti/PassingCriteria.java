package jyoti;

import java.util.Scanner;

public class PassingCriteria {
	
	public static void main(String[] args){
		
		
		System.out.println("Enter your Marks");
		Scanner scan=new Scanner(System.in);
		float marks= scan.nextFloat();
		
		if(marks>40){
			System.out.println("Pass");
			if(marks>=70){
				System.out.println("Distintion");
			}
			if(marks >=60 && marks<70){
				System.out.println("First class");
			}
			if(marks>=50 && marks<60){
				System.out.println("Second class");
			}
			if(marks<50 && marks>=40){
				System.out.println("Third class");
			}
		}else{
			System.out.println("Fail");
		}
		scan.close();
	}

}
