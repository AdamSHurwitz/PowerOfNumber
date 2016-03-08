package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class Class {
    static private final String LOG_TAG = Class.class.getSimpleName();

    static int v = 18;

    public static void main(String[] arg) {
        System.out.println("Answer is " + method(v));
    }

    public static int method(int v) {
        return v;
    }
}
