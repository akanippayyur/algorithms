package com.app.algorithms.string;


public class ExpressionEvaluator {

	public static void main(String[] args) {
		String input = "x    -1 =5";
		int sum = 0;
		char[] arr = input.toCharArray();
		for (int i = 0; i<= arr.length -1; i++) {
			if(arr[i] == ' ' ) {
				continue;
			} else {
				System.out.println(arr[i]);
				if(arr[i] == '-' || arr[i] == '+' || arr[i] == '*' || arr[i] == '/') {
					sum =+ Integer.parseInt(arr[i] + ""+ arr[i + 1]);
				}
				
				if(arr[i] == '=') {
					sum = Integer.parseInt(new String(""+arr[i+1])) + ((-1)* sum);
				}
			}
		}
		
		System.out.println(sum);
	}
}