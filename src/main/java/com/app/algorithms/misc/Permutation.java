package com.app.algorithms.misc;

/**
 * Created by akanippayyur on 10/4/16.
 */
public class Permutation {

    public static void main(String args[]) {
        int n = 5;
        int r = 3;

        System.out.println(calculatePermutations(n, r));
    }

    /**
     * Find P(n,r) where: P(n,r) = n! / (n - r)!
     *
     * @param n
     * @param r
     * @return
     */
    private static int calculatePermutations(int n, int r) {
        if (n == r) {
            return 1;
        }

        int nFact = factorial(n);
        int nMinusRFact = factorial(n - r);

        return nFact / nMinusRFact;
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * (factorial(n - 1));
    }

}
