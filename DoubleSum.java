package com.promineotech;

import java.util.Scanner;

public class DoubleSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount of decimal numbers you would like to sum up and average:");
		int n = sc.nextInt();
		double[] arrayLength = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Please enter a decimal number:");
			arrayLength[i] = sc.nextDouble();
		}
		System.out.println(returnDoubleSum(arrayLength));
	}
	// Write a method that takes an array of double and returns the average of all the elements in the array
	public static double returnDoubleSum(double [] arr) {
		// find first element
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum/arr.length;
		
	}
}
