/* 	
 	Daniel Potter
	11/02/21
 	Checks salesperson status then displays the salary 
*/

package com.test.Week2;
import java.util.Scanner;

public class SalaryChecker {

	public static void main(String[] args) {
		
		String status, job = "";
		int salary = 0;
		
		Scanner input = new Scanner(System.in);
		
		// INPUT status
		System.out.println("Please enter your salesperson status. Enter 's' for senior or 'j' for junior.");
		status = input.nextLine();
		
		// IF status = s || j THEN
		if(status.equalsIgnoreCase("s") || status.equalsIgnoreCase("j") ) {
			if(status.equalsIgnoreCase("s")) {
				// SET salary = 400
				salary = 400;
				job = "senior";
			} else {
				// SET salary = 275
				salary = 275;
				job = "junior";
			}
			System.out.printf("You are a "+job+". Your salary is $"+salary+" p/w.");
		} else {
			// DISPLAY Invalid salesperson status
			System.out.printf("Invalid salesperson status.  Enter 's' for senior or 'j' for junior.");
		}
	}
}