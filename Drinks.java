package com.promineotech;

import java.util.Scanner;

public class Drinks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Is it hot outside? Enter true or false");
		boolean isHotOutside = sc.nextBoolean();
		System.out.println("How much money do you have in your pocket right now? (Be sure to input a decimal number).");
		double moneyInPocket = sc.nextDouble();
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));

	}
// Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if ((isHotOutside == true) && (moneyInPocket > 10.50)){
		return true;
		}
		else {
			return false;
		}
	}
}
