package com.app.algorithms.array;

/**
 * This program checks if the product of two numbers in the array is equal as
 * the one provided
 * 
 * @author Anoop
 */
public class ProductOfNumbers {

	public static void main(String[] args) {
		int inputArray[] = { 200, 10, 1, 50, 20 };
		int product = 20000;
		boolean isProductAvailable = productAvailable(inputArray, product);

		System.out.println(isProductAvailable);
	}

	private static boolean productAvailable(int[] inputArray, int product) {
		for (int n = 0; n <= (inputArray.length - 1); n++) {
			System.out.println(inputArray[n]);
			for (int m = n + 1; m <= (inputArray.length - 1); m++) {
				System.out.println(inputArray[n] + ":" + inputArray[m]);
				if ((inputArray[n] * inputArray[m]) == product) {
					return true;
				}
			}
		}
		return false;
	}
}
