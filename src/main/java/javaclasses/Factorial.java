package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class Factorial {
    static private final String LOG_TAG = Factorial.class.getSimpleName();

    static long n = 19;

    public static void main(String[] arg) {
        System.out.println("Result of " + n + " is " + factorial(n));
    }

    public static long factorial(long n) {
        long s = n;
        for (long x = n - 1; x > 0 ; x--) {
            s = s * x;
        }
        return s;
    }
}
