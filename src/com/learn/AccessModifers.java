package com.learn;

//public = accessible to everyone
// private = accessible to the class itself where they are declared
// default = package access - no access modifier specified
// protected = inherited to children but private to others = package + children

public class AccessModifers {
	// Instance Variable - Values attached to instance created
	// Static Variables - Class level variable
	
	
	// Default access - no access modifier specified
	String defaultVariable = "Default Data";
	// public 
	public String publicVariable = "Public Data";
	// protected 
	protected String protectedVariable = "protected Data";
	// private 
	private String privateVariable = "private Data";
	

	public void printVariable() {
		System.out.println(defaultVariable);
		System.out.println(publicVariable);
		System.out.println(protectedVariable);
		System.out.println(privateVariable);
	}
	
	
	public static void main(String[] args) {
		AccessModifers object= new AccessModifers();
		object.printVariable();
	}
}
