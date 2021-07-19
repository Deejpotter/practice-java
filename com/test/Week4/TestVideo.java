/* 	
 	Daniel Potter
	25/02/21
 	Creates a Video object and tests the constructors
*/

package com.test.Week4;

public class TestVideo {

	public static void main(String[] args) {
		
		// Construct the objects
		Video vid1 = new Video();
		Video vid2 = new Video("Magic Max", "Magic", 10.50);
		
		
		// Set vid1
		vid1.setName("Dinomen");
		vid1.setCategory("Dinosour");
		vid1.setPrice(5.30);
		
		
		// Display vid1 info
		System.out.println(
				"The first object was created with the default constructor.\n"
				+ "The details of the first video are:\n"
				+ "Name: "+vid1.getName()+"\n"
				+ "Category: "+vid1.getCategory()+"\n"
				+ "Price: "+vid1.getPrice()+"\n"
				+ "Sale price: "+vid1.salePrice()+"\n"
		);
		
		
		// Display vid2 info
		System.out.println(
				"The second object was created with the full constructor.\n"
				+ "The details of the second video are:\n"
				+ "Name: "+vid2.getName()+"\n"
				+ "Category: "+vid2.getCategory()+"\n"
				+ "Price: "+vid2.getPrice()+"\n"
				+ "Sale price: "+vid2.salePrice()
		);
	}

}
