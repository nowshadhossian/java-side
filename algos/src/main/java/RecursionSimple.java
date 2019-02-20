package main.java;


/**
 * Prints 5 4 3 2 1 1 2 3 4 5
 *
 */
public class RecursionSimple {
    public static void main(String[] a) {
        int test = 5;
        printFun(test);
    }


    static void printFun(int test) {
        if (test < 1) {
            return;
        } else {
            System.out.printf("%d ", test);
            printFun(test - 1); // statement 2
            System.out.printf("%d ", test);
            return;
        }
    }


}
