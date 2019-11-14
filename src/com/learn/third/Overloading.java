package com.learn.third;

public class Overloading {

	/* Methods in Java  - You can Overload them
	 * 1. Access Modifier
	 * 2. Return type - Premitive , Object, void - return
	 * 3. Method name  - user defined logical ()
	 * 4. parameters  - arguments or inputs in ()
	 * 5. Method Body {}
	 * 6. Exception - we will discuss this later (in exception handling)
	 */
	
	public void checkAddress(String address) {
		System.out.println("Checking address with Google Maps :: " + address);
	}
	
	public void checkAddress() {
		System.out.println("Checking address with Google Maps :: " );
	}
	
	public void checkAddress(String address, int zipCode) {
		System.out.println("Checking address with Google Maps");
	}
	
	public void checkAddress(int zipCode) {
		System.out.println("Checking address with Google Maps");
	}
	
	
	public static void main(String[] args) {
		
		// Best Example of Overloading
		System.out.println(12);
		System.out.println("Stirng");
		
		

	}

}
