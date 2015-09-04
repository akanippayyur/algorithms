/**
 * 
 */
package com.app.algorithms.string;

/**
 * @author akanippayyur
 *
 */
public class StringRev {

	public static void main(String[] args) {
		String input = new String("Hello! This is not correct.");
		System.out.println("Input: "+input);

		/**
		 * Rev each character by character and prints.
		 */
		String rev = convert(input);
		System.out.println("Output: " +rev);
	}

	/**
	 * @param input
	 * @return
	 */
	private static String convert(String input) {
		String rev = "";
		for (int i = (input.length() -1); i >=0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}
}
