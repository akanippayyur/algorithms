package com.app.algorithms.search;

/**
 * Created by akanippayyur on 9/28/16.
 */
public class PatternMatchingString {

    public static void main(String args[]) {
        String input = "AABCD";
        String key = "ABCD";

        isPresent(input.toCharArray(), key.toCharArray());
    }

    private static void isPresent(char[] input, char[] key) {
        int M = input.length;
        int N = key.length;


        int k = 0;
        int o = 0;
        int b = 0;
        while (b <= M) {
            if (key[k] == input[o]) {
                k++;
                o++;
            } else {
                k = 0;
                o--;
            }

            if (k == N) {
                System.out.println("Key Found!");
            }

            b++;
        }
    }

}
