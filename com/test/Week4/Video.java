/* 	
 	Daniel Potter
	25/02/21
 	Creates a Video object
*/

package com.test.Week4;

public class Video {

	// Variables
	private String name;
	private String category;
	private double price;
	
	
	// Default constructor
	public Video() {}
	
	// Full constructor
	public Video(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	// User methods
	public double salePrice() {
		double finalPrice = 0;
		finalPrice = this.price * 1.2;
		return finalPrice;
	}
}
