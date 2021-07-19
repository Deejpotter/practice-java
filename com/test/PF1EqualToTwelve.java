/* 	
 	Daniel Potter
	11/03/21
 	Checks if input is greater than, less than, or equal to 12 then displays info.
*/

package com.test;

import java.util.Scanner;

public class PF1EqualToTwelve {

	public static void main(String[] args) {
		
		// Initialise variables
		Scanner input = new Scanner(System.in);
		int userNum = 0;
		
		// Collect input
		System.out.print("Please enter a whole number.");
		userNum = input.nextInt();
		
		// Check if userNum > 12
		if(userNum > 12) {
			int i = 0;
			// Print each number up to userNum
			while(i < userNum) {
				i++;
				System.out.print(i+" ");
			}
		} 
		// or < 12
		else if (userNum < 12) {
			System.out.print("Your number is less than 12");
		} 
		// or == 12
		else if(userNum == 12) {
			int i = 0;
			// Print every second number up to 12
			while(i < 12) {
				i += 2;
				System.out.print(i+" ");
			}
		} 
		// Otherwise display an error message
		else {
			System.out.print("Please enter a whole number. 1, 2, 3… etc.");
		}
		
	}

}
