/**
 * 
 */
package com.app.algorithms;

/**
 * @author akanippayyur
 *
 */
public class Fibonacci {

	/**
	 * 
	 */
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(printFibonacci(i));
			i++;
		}
	}

	/**
	 * @param i
	 * @return
	 */
	private static int printFibonacci(int i) {
		if(i == 0) return 0;
		if(i == 1) return 1;
		return printFibonacci(i - 1) + printFibonacci(i - 2);
	}
}