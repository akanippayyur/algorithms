/**
 * 
 */
package com.app.algorithms;

/**
 * @author akanippayyur
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int input[] = new int[] { 20, 100, 50, 12, 36, 72, 1, -1 };
		bubbleSort.sort(input);
		for (int inp : input) {
			System.out.println(inp);
		}
	}

	/**
	 * @param input
	 */
	private void sort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				swap(input, i, j);
			}
		}
	}

	/**
	 * @param input
	 * @param i
	 * @param j
	 */
	private void swap(int[] input, int i, int j) {
		if (input[i] < input[j]) {
			int tmp = input[j];
			input[j] = input[i];
			input[i] = tmp;
		}
	}
}
