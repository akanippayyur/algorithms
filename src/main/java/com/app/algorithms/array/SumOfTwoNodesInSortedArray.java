/**
 * 
 */
package com.app.algorithms.array;

/**
 * Check if there are two integers having the sum as given value.
 * @author akanippayyur
 *
 */
public class SumOfTwoNodesInSortedArray {

	public static void main(String[] args) {
		SumOfTwoNodesInSortedArray inSortedArray = new SumOfTwoNodesInSortedArray();
		int input[] = {1,2,3,4,5,6,7};
		int sum = 6;
		boolean output = inSortedArray.doesSumExists(input, sum);
		System.out.println(output ? "Sum exists" : "Sum does not exists.");
	}

	/**
	 * @param input
	 * @param expectedSum 
	 * @return boolean
	 */
	private boolean doesSumExists(int[] input, int expectedSum) {
		int left = 0;
		int right = (input.length) - 1;
		while(left < right) {
			System.out.println("Left: "+left+", Right: "+right);
			int total = input[left] + input[right];
			if(total == expectedSum) {
				return true;
			} else if(total > expectedSum) {
				right--;
			} else if( total < expectedSum) {
				left++;
			}
		}
		return false;
	}
}