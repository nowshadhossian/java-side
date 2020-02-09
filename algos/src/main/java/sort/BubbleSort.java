package main.java.sort;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * first pass
 * ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ),
 * ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 )
 * second pass also compare from 1st index
 * https://www.geeksforgeeks.org/bubble-sort/
 */
public class BubbleSort {
    public static void main(String []a){
        new BubbleSort().de();
    }

    private void de() {

        bubbleSort(new int[]{5,2,1,53,5,8,3});
    }

    public void bubbleSort(int[] input){
        for(int i=0; i< input.length; i++){
            for(int j=0; j< input.length - 1; j++){
                if( input[j] > input[j + 1]){
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }


        }
        Arrays.stream(input).forEach(e -> System.out.print(e + " "));
    }
}
