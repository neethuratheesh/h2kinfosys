package com.learn.second;

public class Loops {

	public static void main(String[] args) {
		// Loop 1 - while loop
		// Dependent on condition to start and stop loops
		// start = condition true stop = condition false
		// Problem - add 1 to 10
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum = sum + i; // newValue = oldValue + (param)
			i++; // increment by 1 --> i++
		}
		System.out.println("Sum of 1 to 10 : " + sum);
		
		int sumEven = 0;
		int sumOdd = 0;
		while(i <= 20) {
			if(i%2 == 0) {
				sumEven = sumEven + i;
			}else {
				sumOdd = sumOdd + i;
			}
			i++;
		}
		System.out.println("Sum of Even Numbers from 1 to 20 : " + sumEven);
		System.out.println("Sum of Odd Numbers from 1 to 20 : " + sumOdd);
		
		/* Do -- while 	 */
		// print 5 sequence 
		int start = 60;
		do {
			start= start + 5;
			System.out.println(start);
		}while(start < 50);
		
		
		// Start point , End Point, increment
		
		for(int j = 5; j <= 50; j = j+5) {
			System.out.println(j);
		}
		
		// Arrays - set of similar elements 
		int [] marks = {19,18,17,19,20}; // index - starts from 0
		//System.out.println(marks[0]);
		//System.out.println(marks[4]);
		int totalMarks = 0;
		// This is for each Loop
		for(int eachSubjectMarks : marks) {
			totalMarks = totalMarks + eachSubjectMarks;
		}
		
		System.out.println("Total marks:: " + totalMarks);
		
		
	}

}
