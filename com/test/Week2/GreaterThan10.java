/* 	
 	Daniel Potter
	11/02/21
 	Checks if number is greater than 10 
*/

package com.test.Week2;
import java.util.Scanner;

public class GreaterThan10 {

	public static void main(String[] args) {
		
		int num1;
		
		Scanner input = new Scanner(System.in);
		
		// INPUT num1
		System.out.println("Please enter a whole number.");
		num1 = input.nextInt();
		
		// IF num1 > 10 THEN
		if(num1 > 10) {
			// DISPLAY The number entered is larger than 10			
			System.out.println("The number entered is larger than 10.");
		} else {
			// DISPLAY The number entered is not larger than 10
			System.out.println("The number entered is not larger than 10.");
		}
		
	}

}
