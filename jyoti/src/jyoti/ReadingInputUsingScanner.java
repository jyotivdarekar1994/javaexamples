package jyoti;

import java.util.Scanner;

public class ReadingInputUsingScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter int value :=");
		int x =scanner.nextInt();
		//System.out.println(x);
		
		System.out.println("Value entered by user is x = "+x);
		System.out.println("Completed");
		scanner.close();
	}
}
