package com.test;
import java.util.Scanner;

public class Subtract {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first number>> ");
		num1 = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your first number>> ");
		num2 = input.nextInt();
		input.nextLine();
		
		System.out.println(num1-num2);
		
	}

}
