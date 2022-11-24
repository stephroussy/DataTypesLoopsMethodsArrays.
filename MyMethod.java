package com.promineotech;

import java.util.Scanner;

public class MyMethod {
	/*I created this converting program because when I first moved from Canada to the United States it took me a while to get used to driving miles per hour rather than 
	 kilometers per hour*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The following program will convert kilometers into miles or miles into kilometers.");
		// asking user to input the distance they'd like converted
		System.out.println("Please enter k to convert kilometers to miles or m to convert miles to kilometers:");
		char distance = sc.next().charAt(0);
		System.out.println("Please enter the distance travelled using decimals:");
		double n = sc.nextDouble();
		// creating a string and if statement to convert and display the opposite measurement of distance
		String measure = "";
		if (distance == 'k' || distance == 'K') {
			measure = " miles";
		}
		else {
			measure = " kilometers";
		}
		// calling the convert method and displaying results
		System.out.println("You have travelled " + convert(distance, n) + measure);
	}
	// convert method will take in their measure distance and convert it to miles or kilometers depending on what they inputed
	public static double convert(char distance, double n) {
		// find first element
		double newDistance = 0.000000000;
		if (distance == 'k' || distance == 'K') {
			newDistance = n * 0.621371;
			return newDistance;
		}
		else {
			newDistance = n * 1.60934;
			return newDistance;
		}
	}

}
