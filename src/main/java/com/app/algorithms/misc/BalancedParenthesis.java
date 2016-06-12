package com.app.algorithms.misc;

import java.util.Stack;

/**
 * Ref: http://introcs.cs.princeton.edu/java/43stack/Parentheses.java.html
 * Question Ref: http://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 * 
 * Given an expression string exp, write a program to examine whether the pairs
 * and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example,
 * the program should print true for exp = “[()]{}{[()()]()}” and false for exp
 * = “[(])”
 * 
 * @author Anoop
 */
public class BalancedParenthesis {

	private static final char L_PAREN = '(';
	private static final char R_PAREN = ')';
	private static final char L_BRACE = '{';
	private static final char R_BRACE = '}';
	private static final char L_BRACKET = '[';
	private static final char R_BRACKET = ']';

	public static void main(String[] args) {
		String input = "[]()";
		System.out.println(isBalancedExpression(input));
	}

	public static boolean isBalancedExpression(String input) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i <= input.toCharArray().length - 1; i++) {
			if (input.charAt(i) == L_BRACKET) {
				stack.push(L_BRACKET);
			}

			else if (input.charAt(i) == R_BRACKET) {
				if (stack.isEmpty())
					return false;
				else if (stack.pop() != L_BRACKET)
					return false;
			}

			if (input.charAt(i) == L_BRACE) {
				stack.push(L_BRACE);
			}

			else if (input.charAt(i) == R_BRACE) {
				if (stack.isEmpty())
					return false;
				else if (stack.pop() != L_BRACE)
					return false;
			}

			if (input.charAt(i) == L_PAREN) {
				stack.push(L_PAREN);
			}

			else if (input.charAt(i) == R_PAREN) {
				if (stack.isEmpty())
					return false;
				else if (stack.pop() != L_PAREN)
					return false;
			}
		}

		return stack.isEmpty();
	}
}
