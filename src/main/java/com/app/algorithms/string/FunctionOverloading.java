package com.app.algorithms.string;

/**
 * There are two ways to overload the method in java
 *      By changing number of arguments
 *      By changing the data type
 *
 * Function overloading when passed with Null, will cause Ambiguous method invocation.
 * Created by akanippayyur on 10/8/16.
 */
public class FunctionOverloading {
    public static void main(String args[]) {
        //System.out.println(search(null));
    }

    private static int search(Integer a) {
        return a;
    }

    private static int search(Integer a, Integer b) {
        return a + b;
    }

    private static int search(String a, String b) {
        return Integer.parseInt(a + b);
    }

    /*private static String search(String a, String b) {
        return "" + a + "" + b;
    }*/

    private static String search(String a) {
        return a;
    }
}
