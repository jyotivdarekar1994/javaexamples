package jyoti;

import java.util.Scanner;

public class WeekCase {
	public static void main(String[] args){
		
		System.out.println("Enter any value 1-7");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		
		switch (x){
		
		case 1:
			System.out.println("Monday");
  		
		                             break;
		case 2:
			System.out.println("Tuesday");
		                            break;
		case 3:
			System.out.println("Wednwsday");
			                        break;
		case 4:
			System.out.println("Thursday");
			                         break;
		case 5:
			System.out.println("Friday");
			                        break;
		case 6:
			System.out.println("Saturday");
			                        break;
		case 7:
			System.out.println("Sunday");
		default:
			System.out.println("not valid");
			}
		scan.close();
		
	}

}
