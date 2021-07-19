/* 	
 	Daniel Potter
	04/02/21
 	Calculates the area of a rectangle 
*/

package com.test;
import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		int length, width;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first number>> ");
		length = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your second number>> ");
		width = input.nextInt();
		input.nextLine();
		
		int area = length * width;
		
		System.out.println("Area = "+area);
		
	}

}
