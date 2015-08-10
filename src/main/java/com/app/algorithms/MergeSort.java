/**
 * 
 */
package com.app.algorithms;

/**
 * @author akanippayyur
 */
public class MergeSort {

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int input[] = { 1, 20, 10, 200, 190, 10, 50 };
		mergeSort.splitAndMerge(input);
		for (int i : input) {
			System.out.println(i);
		}
	}
	/**
	 * @param input
	 * @return
	 */
	public void splitAndMerge(int[] input) {
		split(input, 0, input.length - 1);
	}

	/**
	 * @param input
	 * @param i
	 * @param length
	 */
	private void split(int[] input, int index, int length) {
		System.out.println("Low: " + index + "High: " + length);
		if (index < length) {
			int midIndx = index + (length - index) / 2;

			split(input, index, midIndx);
			split(input, midIndx + 1, length);

			merge(input, index, midIndx, length);
		}
	}

	/**
	 * @param input
	 * @param index
	 * @param midIndx
	 * @param length
	 * @return
	 */
	private void merge(int[] input, int index, int midIndx, int length) {
		// Copy both parts into the helper array
		int tmp[] = new int[input.length];
		for (int i = index; i < input.length; i++) {
			tmp[i] = input[i];
		}

		int i = index;
		int j = midIndx + 1;
		int k = index;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= midIndx && j <= length) {
			System.out.println("I:" + i + " And J: " + j);
			if (tmp[i] <= tmp[j]) {
				input[k] = tmp[i];
				i++;
			} else {
				input[k] = tmp[j];
				j++;
			}
			k++;
		}

		// Copy the rest of the left side of the array into the target array

		while (i <= midIndx) {
			input[k] = tmp[i];
			k++;
			i++;
		}
	}
}
