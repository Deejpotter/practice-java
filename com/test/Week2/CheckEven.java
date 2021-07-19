/* 	
 	Daniel Potter
	11/02/21
 	Checks if number is even 
*/

package com.test.Week2;
import java.util.Scanner;

public class CheckEven {

	public static void main(String[] args) {
		
		int num1;
		
		Scanner input = new Scanner(System.in);
		
		// INPUT num1
		System.out.println("Please enter a number.");
		num1 = input.nextInt();
		
		// IF num1 > 0 THEN
		if(num1 > 0) {
			// MULTIPLY num1 * 10
			num1 *= 10;
			// DISPLAY num1		
			System.out.println(num1);
		} else {
			// DISPLAY Number is not positive
			System.out.println("Number is not positive.");
		}
		
	}

}
