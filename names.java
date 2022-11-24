package com.promineotech;

public class names {

	public static void main(String[] args) {
		/*Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob” */
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		averageLetters(names);
		contcatNames(names);
		countNameLength(names);
	}
	/*Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console*/
	public static void averageLetters(String [] arr) {
		// creating variable to count characters in array
		int count = 0;
		// creating loop to loop through each individual name
		for (int i = 0; i < arr.length; i++) {
			// creating loop to go through each individual character of individual name
			for (int j = 0; j < arr[i].length(); j++) {
				count += 1;
			}
		}
		int result = count/arr.length;
	    System.out.println(result);
	}
	
	/* Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.*/ 
	public static void contcatNames(String [] arr) {
		// create an empty string to hold concatenated names
		String sentence = "";
		// create space to add between names
		String space = " ";
		// loop through array to add names and space to string
		for (int i = 0; i < arr.length; i++) {
			sentence += arr[i] + space;
			}
		System.out.println(sentence);	
			}
	/*Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.*/
	public static void countNameLength(String [] arr) {
		//creating new array that will hold the same amount of elements as the names array
		int[] nameLengths = new int[arr.length];
		// creating loop to loop through each individual name
		for (int i = 0; i < arr.length; i++) {
			// creating variable to count characters in array
			int count = 0;
			// creating loop to go through each individual character of individual name
			for (int j = 0; j < arr[i].length(); j++) {
				count += 1;
			}
			nameLengths[i] = count;
		}
	/*Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console. */
		int sum = 0;
		for (int k = 0; k < nameLengths.length; k++) {
			sum += nameLengths[k];
		}
		System.out.println(sum);
	}
}