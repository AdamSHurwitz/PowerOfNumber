package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class Factorial {
    static private final String LOG_TAG = Factorial.class.getSimpleName();

    static int n = 5;

    public static void main(String[] arg) {
        System.out.println("Result of " + n + " is " + factorial(n));
    }

    public static int factorial(int n) {
        int s = n;
        for (int x = n - 1; x > 0 ; x--) {
            s = s * x;
        }
        return s;
    }
}
