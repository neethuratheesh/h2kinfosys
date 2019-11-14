package com.learn.second;

public class Operators {

	static int firstVar = 100;
	static int secondVar = 200;
	
	public static void main(String[] args) {
		System.out.println("Greater than : > " + (firstVar > secondVar));
		System.out.println("Less than : < " + (firstVar < secondVar));
		System.out.println("Greater than or equals : >= " + (firstVar >= secondVar));
		System.out.println("Less than or equals : > " + (firstVar <= secondVar));
		System.out.println("Not Equals : != " + (firstVar != secondVar));
		System.out.println("Equals : == " + (firstVar == secondVar));
		
		// AND / OR and NOT
		/* truth table for AND
		 * Statement_1	 Statement_2	Result
		 * 	T				T				T
		 * 	T				F				F
		 * 	F				T				F
		 *  F				F				F
		 */
		
		System.out.println("True && True " + (true && true));
		System.out.println("True && False " + (true && false));
		System.out.println("False && True " + (false && true));
		System.out.println("False && False " + (false && false));
		
		
		/* truth table for OR
		 * Statement_1	 Statement_2	Result
		 * 	T				T			  T
		 * 	T				F			  T	
		 * 	F				T			  T	
		 *  F				F		      F		
		 */
		
		System.out.println("True || True " + (true || true));
		System.out.println("True || False " + (true || false));
		System.out.println("False || True " + (false || true));
		System.out.println("False || False " + (false || false));
		
		// NOT
		System.out.println("!True " + (!true));
		System.out.println("!False " + (!false));
		
	}

}
