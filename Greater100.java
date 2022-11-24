package com.promineotech;

import java.util.Scanner;

public class Greater100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("If the sum of all the numbers you enter is greater than 100, the program will display true.");
		System.out.println("Please enter the amount of numbers you would like to sum up:");
		int n = sc.nextInt();
		int[] arrayLength = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Please enter a number:");
			arrayLength[i] = sc.nextInt();
		}
		System.out.println(calc(arrayLength));
	}
	/*Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100*/ 
	public static boolean calc(int [] arr) {
		// find first element
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		if (sum > 100) {
			return true;
		}
		else {
			return false;
		}
	}
}
