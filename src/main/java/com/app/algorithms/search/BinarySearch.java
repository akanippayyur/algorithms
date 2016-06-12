package com.app.algorithms.search;

/**
 * Ref:
 * http://www.java2novice.com/java-search-algorithms/binary-search-recursion/
 * http://www.geeksforgeeks.org/problem-binary-search-implementations/ Access
 * Search Insertion Deletion O(log(n)) O(log(n)) O(log(n)) O(log(n))
 * 
 * Worst Access Search Insertion Deletion O(n) O(n) O(n) O(n)
 * 
 * @author akanippayyur
 */
public class BinarySearch {

	public static void main(String[] args) {
		int input[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int key = 0;
		BinarySearch binarySearch = new BinarySearch();
		System.out
				.println(((binarySearch.search(input, key) == -1) ? "Not Present."
						: "Present."));

		System.out.println(((binarySearch.isPresent(input, 0,
				(input.length - 1), key) == -1) ? "Not Present." : "Present."));
	}

	/**
	 * @param input
	 * @param string
	 * @return
	 */
	private int search(int[] input, int key) {
		int i = 0;
		int j = input.length - 1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (key < input[mid]) {
				j = mid - 1;
			} else if (key > input[mid]) {
				i = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	private int isPresent(int[] input, int i, int j, int key) {
		while (i <= j) {
			int mid = (i + j) / 2;

			if (key < input[mid]) {
				return isPresent(input, i, mid - 1, key);
			} else if (key > input[mid]) {
				return isPresent(input, mid + 1, j, key);
			} else {
				return mid;
			}
		}

		return -1;
	}
}
