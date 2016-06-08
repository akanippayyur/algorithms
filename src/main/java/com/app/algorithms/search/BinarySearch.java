/**
 * 
 */
package com.app.algorithms.search;

/**
 * @author akanippayyur
 */
public class BinarySearch {

	public static void main(String[] args) {
		int input[] = new int[] {1,2,3,4,5,6,7};
		BinarySearch binarySearch = new BinarySearch();
		System.out.println(((binarySearch.search(input, 0) != -1) ? "Not Present." : "Present."));
	}

	/**
	 * @param input
	 * @param string 
	 * @return
	 */
	private int search(int[] input, int key) {
		int i = 0;
		int j = input.length - 1;
		while(i <  j) {
			int mid = (i + j)/2;
			if(key < input[mid]) {
				j = mid - 1;
			} else if(key > input[mid]) {
				i = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}