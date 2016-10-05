package com.app.algorithms.misc;

/**
 * Created by akanippayyur on 10/4/16.
 */
public class Combination {

    public static void main(String args[]) {
        int n = 5;
        int r = 3;

        System.out.println(calculateCombination(n, r));
    }

    /**
     * Find C(n,r) where: C(n,r) = n! / r! (n - r)!
     *
     * @param n
     * @param r
     * @return
     */
    private static int calculateCombination(int n, int r) {
        if (n == r) {
            return 1;
        }

        int nFact = factorial(n);
        int rFact = factorial(r);
        int nMinusRFact = factorial(n - r);
        System.out.println(nFact + ":" + rFact + ":" + nMinusRFact);

        return nFact / (rFact * nMinusRFact);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * (factorial(n - 1));
    }
}
