package com.app.algorithms.string;

/**
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

    private static String search(String a) {
        return a;
    }
}
