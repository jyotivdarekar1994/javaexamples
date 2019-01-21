package mindscriptClassAssignments;

import java.util.Scanner;

public class Assignment2c {	
	public static void main(String[] args) {
		
		//int a;
		//int b;
		
		System.out.println("Enter the value a=");
		System.out.println("Enter the value b=");
		
		
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		
		
		Scanner s2=new Scanner(System.in);
		int b=s2.nextInt();
		
		int c = a+b;
		int d = a-b;
		
		System.out.println("Addtion="+c);
		System.out.println("Division ="+d);
		
		
		
		s1.close();
		s2.close();
	}

}
