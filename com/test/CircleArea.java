/* 	
 	Daniel Potter
	04/02/21
 	Calculates the area of a circle 
*/

package com.test;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double PI = 3.14;
		double radius;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the radius>> ");
		radius = input.nextInt();
		input.nextLine();
		
		double area = PI * radius * radius;
		double circumference = 2 * PI * radius;
		
		System.out.printf("%-30.30s %-30.30s%n", "Area", "Circumference");
		System.out.printf("%-30.30s %-30.30s%n", area, circumference);
		
	}

}
