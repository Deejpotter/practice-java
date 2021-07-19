/* 	
 	Daniel Potter
	11/02/21
 	Checks a postcode and displays the location 
*/

package com.test.Week2;
import java.util.Scanner;

public class PostcodeChecker {

	public static void main(String[] args) {
		
		int postcode;
		
		Scanner input = new Scanner(System.in);
		
		// INPUT postcode
		System.out.println("Please enter your postcode:");
		postcode = input.nextInt();
		
		// SWITCH postcode
		switch (postcode) {
		
		// CASE 3199
		case 3199:
			// DISPLAY You’re in Frankston
			System.out.println("You're in Frankston");
			break;
		// CASE 3175
		case 3175:
			// DISPLAY You’re in Dandenong
			System.out.println("You're in Dandenong");
			break;
		// CASE 3129
		case 3129:
			// DISPLAY You’re in Blackburn
			System.out.println("You're in Blackburn");
			break;
		// DEFAULT
		default:
			// DISPLAY Not a valid postcode
			System.out.println("Not a valid postcode. Valid postcodes are 3199, 3175, 3129.");
			
		// END SWITCH
		}
	}
}