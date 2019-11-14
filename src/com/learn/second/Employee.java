package com.learn.second;

public class Employee { 
	
	private String name;
	private int empId;
	private String address;
	
	public static void main(String[] args) {
		// How to create Object of class 
		// ClassName objectName = new ClassName()
		Employee empFirst = new Employee();
		Employee empSecond = new Employee();
		
		empFirst.checkAddress("Address");
		Employee.companyName();
	}
	
	/* Methods in Java 
	 * 1. Access Modifier
	 * 2. Return type - Premitive , Object, void - return
	 * 3. Method name  - user defined logical ()
	 * 4. parameters  - arguments or inputs in ()
	 * 5. Method Body {}
	 * 6. Exception - we will discuss this later (in exception handling)
	 */
	// Non - static or instance methods
	public boolean checkAddress(String address) {
		System.out.println("Checking address i Google Maps :: " + address);
		return true;
	}
	
	// Static methods do not need instance
	public static String companyName() {
		return "Best Buy Inc";
	}

}
