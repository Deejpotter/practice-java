package com.test;

public class YourInfo {

	public static void main(String[] args) {
		String name = "Daniel";
		String address = "Frankston North";
		String hobbies = "Computer stuff, philosophy";
		
		System.out.printf("%-30.30s %-30.30s %-30.30s%n", "Name", "Address", "Hobbies");
		System.out.printf("%-30.30s %-30.30s %-30.30s%n", name, address, hobbies);
		
	}

}
