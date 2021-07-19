/* 	
 	Daniel Potter
	11/02/21
 	Checks wind speed and outputs alert information
*/

package com.test.Week2;
import java.util.Scanner;

public class WindSpeed {

	public static void main(String[] args) {
		
		int windSpeed;
		
		Scanner input = new Scanner(System.in);
		
		// INPUT windSpeed
		System.out.println("Please enter your windSpeed:");
		windSpeed = input.nextInt();
		
		// IF windSpeed <= 33
		if (windSpeed <= 33 && windSpeed > 0) {
			// DISPLAY No alert
			System.out.println("No alert");
		// ELSE IF windSpeed <= 63 AND windSpeed > 33
		} else if (windSpeed <= 63 && windSpeed > 33) {
			// DISPLAY Tropical Cyclone Alert
			System.out.println("Tropical Cyclone Alert");
		// ELSE IF windspeed > 63
		} else if (windSpeed > 63) {
			// DISPLAY Severe Tropical Cyclone Alert
			System.out.println("Severe Tropical Cyclone Alert");
		// ELSE
		} else {
			// DISPLAY Invalid input
			System.out.println("Invalid input");
		}
	}
}