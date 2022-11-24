package com.promineotech;

import java.util.Scanner;

public class fullNames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String firstName = sc.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = sc.nextLine();
		System.out.println(fullName(firstName, lastName));
		
		
	}
	
	/* Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space) */
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
}