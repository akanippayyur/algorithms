package com.app.algorithms.linkedlist;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 15 };
		int array2[] = new int[10];
		array2[0] = 10;
		array2[1] = 20;
		array2[2] = 30;
		array2[3] = 40;
		array2[4] = 50;
		array2[5] = 60;

		// System.out.println(array2.length);
		merge(array1, array2);

		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

	private static void merge(int[] array1, int[] array2) {
		int m = array1.length - 1;
		int n = array2.length - 1;
		int i = findTheIndexOfLargestValue(array1);
		System.out.println("i: " + i);
		int j = findTheIndexOfLargestValue(array2);
		System.out.println("j: " + j);

		System.out.println("i: " + i + " j: " + j);
		System.out.println("m: " + m + " n: " + n);
		while (m >= 0 && n >= 0 && j >= 0 && i >= 0) {
			System.out.println("array1[i]: " + array1[i] + " array2[j]: "
					+ array2[j]);
			if (array1[i] > array2[j]) {
				System.out.println(" i: " + i + " j: " + j);
				array2[n--] = array1[i--];
			} else {
				System.out.println(" i: " + i + " j: " + j);
				array2[n--] = array2[j--];
			}
		}
		
		System.out.println("i: " + i + " j: " + j);
		System.out.println("m: " + m + " n: " + n);

		if (i > j) {
			while (i >= 0) {
				System.out.println("i: " + i + " j: " + j);
				array2[n--] = array1[i--];
			}
		} else {
			while (i >= 0) {
				array2[n--] = array1[j--];
			}
		}
		
		while(n>=0) {
			array2[n--] = 0;
		}
	}

	private static int findTheIndexOfLargestValue(int[] array) {
		int i = 0;
		while (i < array.length - 1) {
			if (array[i] > array[i + 1]) {
				System.out.println("Size: " + i);
				return i;
			}
			i++;
		}
		// TODO Auto-generated method stub
		return i;
	}
}
