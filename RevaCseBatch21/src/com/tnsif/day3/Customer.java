package com.tnsif.day3;

public class Customer {
	
	//Data members
	private String customerName;
	private String customerCity;
	private int age;
	
	//Default constructor

	public Customer() {
		
		System.out.println("default constructor");
	}
	//Parameterized constructor

	public Customer(String customerName, String customerCity, int age) {
	
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.age = age;
	}
	
}
