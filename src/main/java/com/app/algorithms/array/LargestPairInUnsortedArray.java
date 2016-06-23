package com.app.algorithms.array;

/**
 * Ref: http://www.geeksforgeeks.org/find-the-largest-pair-sum-in-an-unsorted-array/
 * Find the largest pair sum in an unsorted array
 * @author Anoop
 */
public class LargestPairInUnsortedArray {

	public static void main(String[] args) {
		int[] input = new int[] { 10, 200, 100, 500, 1 };
		printLargestPair(input);
	}

	private static void printLargestPair(int[] input) {
		int first = 0;
		int second = 0;

		if (input[0] > input[1]) {
			first = input[0];
			second = input[1];
		} else {
			first = input[1];
			second = input[0];
		}
		
		for (int i = 2; i < input.length; i++) {
			if(input[i] > first) {
				second = first;
				first = input[i];
			}
			
			if(input[i] < first && input [i] > second) {
				second = input[i];
			}
		}
		
		System.out.println("First: "+first+" Second: "+second);
	}
}
