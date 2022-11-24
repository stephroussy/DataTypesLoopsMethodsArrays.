package com.promineotech;

public class AverageAge {
	
	public static void main(String[] args) {
		/*Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93 */
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
		calc(ages);
		averagedAge(ages);
		
		/*Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).*/
	    
	    int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 32};
	    calc(ages2);
	    averagedAge(ages2);
	}
	/* Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. */ 
	public static void calc(int [] arr) {
		// find first element
		int a = arr[0];
	    // find last element
	    int b = arr[arr.length - 1];
	    System.out.println(b-a);
	}
	/*Use a loop to iterate through the array and calculate the average age. Print the result to the console.*/
	public static void averagedAge(int [] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int result = sum/arr.length;
	    System.out.println(result);
	}

}
