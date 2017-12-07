package main.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Question: https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
 * Created by nowshad on 12/7/17.
 */
public class StringContainHackerRankMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String hack = "hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            boolean found = false;
            here : for(int i=0;i<hack.length(); i++){
                char ch = hack.charAt(i);
                int index = s.indexOf(ch);
                if(index >= 0){
                    if(!(hack.length() == i + 1)){
                        try{
                            s = s.substring(index + 1);
                        }catch(Exception e){ found = false;
                            break here;}
                    }

                } else {
                    found = false;
                    break here;
                }

                if(hack.length() == i+1){
                    found = true;
                }
            }
            if(found){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

        }
    }
}
