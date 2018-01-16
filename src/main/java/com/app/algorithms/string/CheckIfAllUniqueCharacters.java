package com.app.algorithms.string;

public class CheckIfAllUniqueCharacters {

    public static void main(String[] args) {
        String input = "bbvdzs";
        int marker = 0;
        System.out.println(isUnique(input));
    }

    private static boolean isUniqueCharacters(String input, int marker) {
        for (int i = 0; i < input.length(); i++) {
            //System.out.print(input.charAt(i)+": ");
            int val = input.charAt(i) - 'a';
            if ((marker & (1 << val)) > 0) {
                return false;
            }

            marker |= (1 << val);
        }

        return true;
    }

    private static boolean isUnique(String input) {
        if (input.length() > 128) {
            return false;
        }

        boolean[] markers = new boolean[128];
        for (int i = 0; i < input.length(); i++) {
            int a = (int) input.charAt(i);
            if (markers[a] == true) {
                return false;
            }

            markers[a] = true;
        }

        return true;
    }

}
