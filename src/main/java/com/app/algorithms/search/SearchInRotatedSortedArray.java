package com.app.algorithms.search;

/**
 * 
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2). How do you find an element
 * in the rotated array efficiently? You may assume no duplicate exists in the
 * array.
 * 
 * 
 * In fact, we don’t need to know where the pivot is. Look at the middle element
 * (7). Compare it with the left most (4) and right most element (2). The left
 * most element (4) is less than (7). This gives us valuable information — All
 * elements in the bottom half must be in strictly increasing order. Therefore,
 * if the key we are looking for is between 4 and 7, we eliminate the upper
 * half; if not, we eliminate the bottom half.
 * 
 * @author Anoop
 */
public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		int number = 7;
		int index = search(arr, number, 0, arr.length - 1);
		System.out.println(index);
	}

	private static int search(int[] arr, int number, int leftIndex, int rightIndex) {
		int mid = leftIndex + (rightIndex - leftIndex) / 2;
		System.out.println("Left: "+leftIndex+ " Right: "+rightIndex+" Mid: "+mid);

		int value = 0;
		if(arr[mid] == number) {
			value = search(arr, number, leftIndex, mid - 1);
		} else if(arr[mid] > number) {
			value = search(arr, number, leftIndex, mid - 1);
		} else if(arr[mid] < number) {
			value = search(arr, number, mid, rightIndex);
		}
		return -1;
	}
}
