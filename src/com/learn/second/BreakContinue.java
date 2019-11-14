package com.learn.second;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i =0; i < 10; i++) {
			System.out.println(i);
			if(i == 7) {
				break; // breaks the loop
			}
		}
		System.out.println("Out of the loop with break ");
		
		for(int i=0; i < 10; i++) {
			if(i == 7) {
				continue; // Skips further block and jump to next value
			}
			System.out.println(i);
		}
		System.out.println("Check if 7 is missing ");
	}

}
