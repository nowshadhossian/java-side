package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Using bubble sort concept
 */
public class MinBribes {
    public static void main(String []a){
        new MinBribes().de();
    }
   // 1, 2, 3, 4, 5, 6, 7, 8
    //1, 2, 5, 3, 4, 6, 7, 8  -5-2
    //1, 2, 5, 3, 7, 4, 6, 8 -7-2
    //1, 2, 5, 3, 7, 8, 4, 6 -8-2
    //1, 2, 5, 3, 7, 8, 6, 4 -6-1

    /**
     * 5 1 2 3 7 8 6 4  --too
     * 8
     * 1 2 5 3 7 8 6 4  --7
     */

    private void de() {
        calculate(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
    }

    private void calculate(int[] q) {
        int swap = 0;
       for(int i =q.length -1; i >= 0; i--){
           int count = 0;
           for(int j =q.length-2; j>= 0; j--){
               if(q[j] > q[j+1]){
                   int temp = q[j];
                   q[j] = q[j + 1];
                   q[j + 1] = temp;
                   swap++;
                   count++;

                   Arrays.stream(q).forEach(System.out::print);
                   System.out.println(  " C: " +count + " n: " + q[i] );
                   if(count == 3){
                       System.out.println("Too chaotic");
                       return;
                   }
               } else {
                   break;
               }
           }
       }
        System.out.println(swap);
    }


}
