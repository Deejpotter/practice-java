/* 	
 	Daniel Potter
	04/02/21
 	Gets the user's information 
*/

package com.test;
import java.util.Scanner;

public class GetUserInfo {

	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age>> ");
		age = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your full name>> ");
		name = input.nextLine();
		
		System.out.println("Your name is "+name+" and you are "+age+" years old.");
		
	}

}
