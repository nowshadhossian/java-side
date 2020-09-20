package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/special-palindrome-again/problem
 */
public class SpecialStringAgain {
    public static void main(String []a){
        new SpecialStringAgain().de();
    }

    public void de(){
        //asasd 7 a s a s d asa sas
        String str = "mnonopoo";
        System.out.println(find(str));
    }

    private int find(String str) {
     char[] a= str.toCharArray();
     List<String> ar = new ArrayList<>();
     int count = 0;
     for(int i =0; i < a.length; i++){
         for(int j=0; j< Math.min(i, a.length -1 - i) + 1; j++){
             String checkPal = left(a, i, j) + a[i] + right(a, i, j);
             if(pal(checkPal)){
                 count++;
                 ar.add(checkPal);
             } else {
                 break;
             }
         }

     }
     ar.stream().forEach(q -> System.out.println(q));
     return count;
    }

    private String right(char[] a, int i, int j) {
        String input ="";
        for(int z = 1; z <= j; z++){
            input += a[i + z];
        }
        return input;
    }

    public String left(char[] a, int i, int j){
        String input ="";
        for(int z = j; z >0; z--){
            input += a[i - z];
        }
        return input;
    }

    private boolean pal(String a){
        if(a.length() == 1 || a.length() == 0){
            return true;
        }
        if(a.substring(0, 1).equals(a.substring(a.length()-1, a.length()))){
            return pal(a.substring(1, a.length() -1));
        }

        return false;
    }
}
