package main.java;

import java.util.HashMap;

/**
 * https://www.hackerrank.com/challenges/two-strings/problem
 */
public class TwoStringContainsSameChar {
    public static void main(String []a){
        new TwoStringContainsSameChar().de();
    }

    private void de(){
        System.out.println(twoStrings("He", "Hello"));
    }
    String twoStrings(String s1, String s2) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for(Character s: s1.toCharArray()){
            map.put(s, true);
        }
        for(Character s: s2.toCharArray()){
            if(map.containsKey(s)){
                return "YES";
            }
        }
        return "NO";
    }
}
