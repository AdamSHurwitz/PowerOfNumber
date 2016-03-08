package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class Factorial {

    static int n = 5;

    public static void main(String[] arg) {
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static int factorial(int n) {
        int s = n;
        for (int x = n - 1; x > 0 ; x--) {
            s = s * x;
        }
        return s;
    }
}
