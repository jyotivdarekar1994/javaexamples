package practiceExamples;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number a = ");
		int a = sc.nextInt();
		
		System.out.println("Enter a number b = ");
		int b = sc.nextInt();
		
		System.out.println("enter operator");
		char operation = sc.next().charAt(0);
		
		switch(operation){
		
		case '+':System.out.println(a+b);
								break;
		
		case '-':System.out.println(a-b);
								break;
								
		case '/':System.out.println(a/b);
								break;
								
		case '*':System.out.println(a*b);
								break;
								
		case '%':System.out.println(a%b);
								break;
								
		default:System.out.println("Invalid operator");
		}
	
		sc.close();
		
	}

}
