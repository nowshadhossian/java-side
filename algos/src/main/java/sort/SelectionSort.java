package main.java.sort;

import java.util.Arrays;

/**
 * Select an element and find smallest element at right and swap.
 * Then move to next postion. Left side will be swapped
 */
public class SelectionSort {
    public static void main(String []arg){
        new SelectionSort().de();
    }

    private void de() {
        calculate(new int[]{6,29,5,4,2,9,1});
    }

    private void calculate(int[] a) {
        for(int i=0; i< a.length; i++){
            int element = a[i];
            int elementIndex = -1;
            for(int j=i; j< a.length; j++){
                if(a[j] < element){
                    element = a[j];
                    elementIndex = j;
                }
            }
            if(elementIndex > -1){
                a[elementIndex] = a[i];
                a[i] = element;
            }

        }

        Arrays.stream(a).forEach(b -> System.out.print(b + " "));
    }
}
