package com.learn;

public class DataTypes {
	
	public static void main(String[] args) {
		// Data types
		// Numeric - Integer numbers , Decimal
		// Integer 
		byte byteData = -128;
		Byte byteObj = 99; // Wrapper class
		
		short shortData = 9999;
		Short shotObj = 9999; // Wrapper class
		
		int intData = 999999999;
		long longData = 9999999999999999l;
		
		// Decimal 
		float floatData = 999.999f;
		double doubleData = 999999.99999d;
		
		// Character 
		char charData = 'A'; // Single Character in Single Quotes
		
		// Boolean 
		boolean boolData = false;
		
		// String - Non Premitive - Object
		String name = "Neil Armstrong";
		
		
		// Assignment 1. Find Wrapper classes for all Premitive DataTypes
		
		System.out.println("Byte Range :: " + Byte.MAX_VALUE + " And " + Byte.MIN_VALUE);
		System.out.println("Short Range :: " + Short.MAX_VALUE + " And " + Short.MIN_VALUE);
		System.out.println("Integer Range :: " + Integer.MAX_VALUE + " And " + Integer.MIN_VALUE);
		System.out.println("Long Range :: " + Long.MAX_VALUE + " And " + Long.MIN_VALUE);
		System.out.println("Character Range :: " + Character.MAX_VALUE + " And " + Character.MIN_VALUE);
		System.out.println("Boolean Range :: " + Boolean.TRUE + " And " + Boolean.FALSE);
		
		
		// Assignment 2 - Write range for Data types
		
	}

}
