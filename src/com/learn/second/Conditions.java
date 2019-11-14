package com.learn.second;

public class Conditions {
	
	static int firstVar = 1000;
	static int secondVar = 200;
	static int thirdVar = 300;
	
	public static void main(String[] args) {
		
		/* if (condition){
		 * 	block of code if condition is true
		 * }else{
		 * 	block of code when the condition is false
		 */
		if(firstVar > secondVar) {
			System.out.println(firstVar + " is greater than  " + secondVar);
		}else {
			System.out.println(secondVar + " is greater than  " + firstVar);
		}
		
		// check the biggest number among three
		if(firstVar > secondVar) {
			if(firstVar > thirdVar) {
				System.out.println(firstVar + " is greatest");
			}else {
				System.out.println(thirdVar + " is greatest");
			}
		}else {
			if(secondVar > thirdVar) {
				System.out.println(secondVar + " is greatest");
			}else {
				System.out.println(thirdVar + " is greatest");
			}
		}
	
		// Using AND Condition
		System.out.println("Using AND Condition :: ");
		if(firstVar > secondVar && firstVar > thirdVar) {
			System.out.println(firstVar + " is greatest");
		}else if(secondVar > thirdVar){
			System.out.println(secondVar + " is greatest");
		}else {
			System.out.println(thirdVar + " is greatest");
		}
	}

}
