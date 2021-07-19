/* 	
 	Daniel Potter
	11/02/21
 	Checks the weight of the mail then calculates a charge 
*/

package com.test.Week2;
import java.util.Scanner;

public class MailWeight {

	public static void main(String[] args) {
		
		int weight;
		double charge;
		
		Scanner input = new Scanner(System.in);
		
		// INPUT weight
		System.out.println("Please enter the weight of your mail.");
		weight = input.nextInt();
		
		// IF weight <= 8 THEN
		if(weight <= 8) {
			// SET charge = 1.50		
			charge = 1.50;
		} else {
			// CALCULATE SET charge = 1.50 + ((weight - 8) * 0.5)
			charge = 1.50 + ((weight - 8) * 0.50);
		}
		
		String formattedCharge = String.format("%.2f", charge);
		System.out.printf("The weight of your mail is "+weight+"g. The charge for your mail is $"+formattedCharge+".");
	}

}