package practiceExamples;

import java.util.Scanner;

public class ElseIf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a first number a = ");
		int a = sc.nextInt();
		
		System.out.println("Enter a second number b = ");
		int b = sc.nextInt();
		
		System.out.println("Enter a third number c = ");
		int c  = sc.nextInt();
		
		if(a>b){
			
		if(a>c){
			System.out.println(a+"is a greatest number");
		}
		/*if(b>a){
			System.out.println(b+"is a greatest number");
		}*/
		if(b>c){
			System.out.println(b+"is a greatest number ");
		}
		
		}else{
			System.out.println(c+"is a greatest number");
		}
		sc.close();
		}

}
