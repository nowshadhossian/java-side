package main.java;


/**
 * int sumOfDigits(int x);
 * If x is 234, the function should return 2 + 3 + 4, that is, 9.
 */

public class RecursionSumOfDigit {
    public static void main(String []a){
        new RecursionSumOfDigit().de();

    }
    public void de(){
        System.out.println(sumOfDigit( 1234));
    }

    private int sumOfDigit(int number) {
        if(number == 0){
            return 0;
        }

        int total = (number % 10) + sumOfDigit(number /10);

      // System.out.println("here: " + total);
        return total;
    }
}
