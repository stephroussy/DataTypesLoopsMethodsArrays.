package com.promineotech;

import java.util.Scanner;

public class words {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word you'd like to concatinate:");
		String word = sc.nextLine();
		System.out.println("Please enter a number of times you'd like to concatinate the word:");
		int n = sc.nextInt();
		System.out.println(concatWords(word, n));	
	}
	/* Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times*/
	public static String concatWords(String word, int n) {
		String sentence = "";
		for (int i = 0; i < n; i++) {
			sentence += word;
		} return sentence;
	}
}
