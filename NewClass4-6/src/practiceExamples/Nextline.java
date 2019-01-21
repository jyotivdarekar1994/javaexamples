package practiceExamples;

import java.util.Scanner;

public class Nextline {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		
		
		System.out.println(" your name="+name);
		
		sc.close();
	}

}
