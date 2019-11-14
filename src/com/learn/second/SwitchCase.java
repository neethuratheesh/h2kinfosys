package com.learn.second;

import java.util.Calendar;

public class SwitchCase {

	public static void main(String[] args) {
		// Store Opening Batch 
		/**
		 * Monday - 7:30 = 1
		 * Tuesday - 8:30 = 2
		 * Wed - 8:30 = 3
		 * Tuesday - 9:00 = 4
		 * Friday - 7:30 = 5
		 * Saturday - 8:00 = 6
		 * Sunday - 8:00 = 7
		 */
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);; 
		
		// int and family, character or String
		switch(dayOfWeek) {
		case 1:	
		case 5: {
					System.out.println("Store Open Batch Runs at 7:30 AM");
					break;
				}
		case 2:
		case 3:{
					System.out.println("Store Open Batch Runs at 8:30 AM");
					break;
				}
		
		case 4:	 {
					System.out.println("Store Open Batch Runs at 9:00 AM");
					break;
				}
		
		case 6:	
		case 7:	{
					System.out.println("Store Open Batch Runs at 8:00 AM");
					break;
				}
		default: {
					System.out.println("Store Open Batch Runs at 7:45 AM");
					break;
				}
		
		}
		System.out.println("Out of Switch Block");
	}

}
