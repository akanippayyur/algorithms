package com.app.algorithms.array;

//Find a peak element
//http://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
public class PeakElement {

	public static void main(String[] args) {
		int[] array = { 10, 20, 15, 2, 23, 90, 67 };
		System.out.println(array[findPeakElements(array, 0, array.length - 1,
				array.length)]);
	}

	private static int findPeakElements(int[] array, int startIndex,
			int endIndexes, int length) {

		int mid = startIndex + (endIndexes - startIndex) / 2;

		if ((mid == 0 || array[mid - 1] <= array[mid])
				&& (mid == length - 1 || array[mid + 1] <= array[mid]))
			return mid;

		else if (mid > 0 && array[mid - 1] > array[mid]) {
			return findPeakElements(array, startIndex, mid - 1, length);
		} else {
			return findPeakElements(array, mid + 1, endIndexes, length);
		}
	}
}
