package com.app.algorithms.array;

/**
 * Ref: http://www.programcreek.com/2014/02/leetcode-best-time-to-buy-and-sell-stock-java/
 * 
 * @author Anoop
 *
 */
public class MaxAndMinSubsetInArray {

	public static void main(String[] args) {
		int[] input = new int[] { 9, 100, 20, 10, 300 };

		findMinAndMax(input);

	}

	private static void findMinAndMax(int[] input) {
		if (input == null || input.length == 0)
			return;

		int min = input[0];
		int max = 0;

		for (int i = 1; i < input.length; i++) {
			min = Math.min(min, input[i]);
			max = Math.max(max, input[i] - min);
		}

		System.out.println("Min: " + min + "Max: " + max);
	}
}
