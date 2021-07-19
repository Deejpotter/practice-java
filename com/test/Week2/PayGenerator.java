/* 	
 	Daniel Potter
	11/02/21
 	Calculates pay rates
*/

package com.test.Week2;

import java.util.Scanner;

public class PayGenerator {

	public static void main(String[] args) {
		
		double payrate, hoursWorked, overtimeHr, overtimePay, normalHr, normalPay, grossPay;
		
		Scanner input = new Scanner(System.in);
		
		// INPUT payrate
		System.out.println("Please enter your payrate:");
		payrate = input.nextDouble();
		// INPUT hoursWorked
		System.out.println("Please enter your hours worked:");
		hoursWorked = input.nextDouble();
		
		// DISPLAY hoursWorked and payrate
		System.out.println("Your hours worked: "+hoursWorked+".\n"
				+ "Your payrate: "+payrate+".");
		// IF hoursWorked >40 THEN
		if(hoursWorked > 40) {
			// SET overtimeHr=hoursWorked-40
			overtimeHr = hoursWorked - 40.0;
			// SET overtimePay = overtimeHr * payrate * 1.5
			overtimePay = overtimeHr * payrate * 1.5;
			// SET normalHr=40
			normalHr = 40;
		// ELSE
		} else {
			// SET overtimeHr=0
			overtimeHr = 0;
			// SET overtimePay=0
			overtimePay = 0;
			// SET normalHr=hoursWorked
			normalHr = hoursWorked;
		// ENDIF
		}
		// CALCULATE normalpay=normalHr*payrate
		normalPay = normalHr * payrate;
		// CALCULATE grossPay=overtimePay + normalpay
		grossPay = overtimePay + normalPay;
		// DISPLAY overtimeHr, overtimepay, normalHr, normalpay, grossPay
		System.out.println("Your overtime hours: "+overtimeHr+"\n"
				+ "Your overtime pay: "+overtimePay+"\n"
				+ "Your normal hours: "+normalHr+"\n"
				+ "Your normal pay: "+normalPay+"\n"
				+ "Your gross pay: "+grossPay);
	}

}
