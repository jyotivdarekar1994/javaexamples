package mindscriptHomeAssignments;

import java.util.Scanner;

public class Assignment2bAreaPerimeter {

	public static void main(String[] args) {
		double area;
		float perimeter;
		final float PI = (float) 3.14;
		float r;
		
		System.out.println("Radius of circle=");		
		Scanner scan = new Scanner(System.in);
		r = scan.nextFloat();
		
		area = (PI * r * r);
		perimeter = 2 * PI * r;
		
		System.out.println("Area of Circle is=" + area);
		System.out.println("Perimeter of Circle is=" + perimeter);

		scan.close();

	}

}
