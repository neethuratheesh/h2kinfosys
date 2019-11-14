package com.learn;

public class Customer {

	// Instance variables
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	// Static variables
	private static String retailer = "Best Buy Inc";
	
	public static void main(String[] args) {
		// Local Variable 
		String firstName = "Some Value";
		
		
		Customer firstCustomer = new Customer(); // Object creation
		firstCustomer.firstName = "Neil";
		firstCustomer.lastName = "Armstrong";
		firstCustomer.address = "3370 Spring Hill Pkwy";
		firstCustomer.phoneNumber = "808-345-6789";
		
		Customer.retailer = "Walmart Inc";
		
		Customer secondCustomer = new Customer(); // Object creation
		secondCustomer.firstName = "David";
		secondCustomer.lastName = "Nix";
		
		Customer thirdCustomer = new Customer(); // Object creation
		
		
		System.out.println(firstCustomer.firstName);
		System.out.println(firstCustomer.lastName);
		System.out.println(firstCustomer.retailer); // this way is wrong - ClassName.staticVariableName
		
		System.out.println(secondCustomer.firstName);
		System.out.println(secondCustomer.lastName);
		System.out.println(secondCustomer.retailer);
		
		System.out.println(thirdCustomer.firstName);
		
		System.out.println(firstName);
	}
}
