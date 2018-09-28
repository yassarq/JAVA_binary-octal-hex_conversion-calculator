package assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a Scanner to read user input
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome");
		// create user response string
		String rsp = "";
		do {
			// Ask user to enter a low number
			System.out.println("Enter the low number:");
			// Read the number that user entered and store it
			int lowNum = scnr.nextInt();
			// Now ask user to high number
			System.out.println("Enter the high number:");
			// Read user enter value and store it
			int highNum = scnr.nextInt();
			// Now pass the low and high number into 
			// the class constructor to later use
			NumberConverter converter = new NumberConverter(lowNum, highNum);
			// Use the converter method to generate the table
			converter.printTable();
			System.out.println("Do you want to continue? yes or no");
			// read user input and assign it to response variable
			rsp = scnr.next();
			// Check if user said yes, if so continue looping
			// otherwise stop the loop and exit out of it
		} while(rsp.equals("yes"));
		
		scnr.close();
		System.exit(0);
	}
}
