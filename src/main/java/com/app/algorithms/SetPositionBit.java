package com.app.algorithms;

/**
 * Given a number having only one ‘1’ and all other ’0’s in its binary
 * representation, find position of the only set bit. If there is only one '1'
 * bit then print that position else print -1. Position of set bit '1' should be
 * counted starting with 1 from LSB side in binary representation of the number.
 * Print the position if there is only one '1' bit, else print -1. For each test
 * case print the output in a new line.
 * 
 * Ref: http://www.practice.geeksforgeeks.org/problem-page.php?pid=638
 * 
 * @author Anoop
 */
public class SetPositionBit {

	public static void main(String[] args) {
		String input = "3";
		
		int count = convertToBinary(Integer.parseInt(input));
		
		if(count == 1)
			System.out.println("1");
		else
			System.out.println("-1");
	}

	private static int convertToBinary(int parseInt) {
		int count = 0;
		while(parseInt != 1) {
			if((parseInt % 2) == 1) {
				count++;
			}
			parseInt = parseInt/2;
		}
		
		return count;
	}
}
