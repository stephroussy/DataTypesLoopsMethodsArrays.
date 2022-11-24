package com.promineotech;

import java.util.Scanner;

public class BooleanArrays {

	// Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount of decimal numbers you would like to sum up and average in the first array:");
		int n1 = sc.nextInt();
		double[] arrayOne = new double[n1];
		for (int i = 0; i < n1; i++) {
			System.out.println("Please enter a decimal number:");
			arrayOne[i] = sc.nextDouble();
		}
		System.out.println("Please enter the amount of decimal numbers you would like to sum up and average in the second array:");
		int n2 = sc.nextInt();
		double[] arrayTwo = new double[n2];
		for (int i = 0; i < n2; i++) {
			System.out.println("Please enter a decimal number:");
			arrayTwo[i] = sc.nextDouble();
		}
		System.out.println(returnAverageDouble(arrayOne, arrayTwo));
	}
	// Write a method that takes an array of double and returns the average of all the elements in the array.
	public static boolean returnAverageDouble(double [] arr1, double [] arr2) {
		double sum1 = 0.0;
		double sum2 = 0.0;
		double avg1 = 0.0;
		double avg2 = 0.0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
			avg1 = sum1/arr1.length;
		}
		for (int j = 0; j < arr2.length; j++) {
			sum2 += arr2[j];
			avg2 = sum2/arr2.length;
		}
		if (avg1 > avg2) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
