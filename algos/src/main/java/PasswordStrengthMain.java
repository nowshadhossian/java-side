package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Question: https://www.hackerrank.com/contests/hourrank-24/challenges/strong-password
 * Created by nowshad on 11/14/17.
 */
public class PasswordStrengthMain {
    public static void main(String []b){
        System.out.println(new PasswordStrengthMain().minNumber(5, "Ab1"));
    }

    public int minNumber(int length, String password){
        Pattern lowerCase =  Pattern.compile("[a-z]");
        Pattern upperCase =  Pattern.compile("[A-Z]");
        Pattern digit =  Pattern.compile("[0-9]");
        Pattern specialCharacter =  Pattern.compile("[!@#$%^&*()\\-+]");

        List<Pattern> patterns = Arrays.asList(lowerCase, upperCase, digit, specialCharacter);

        int count = 0;
        for(Pattern pattern : patterns){
            if(pattern.matcher(password).find()){
                count++;
            }
        }

        //aab - 3 + 0
        //aaaaaa - 3 + 0
        //aZ%a - 1 + 1
        //&+^& - 3 + 0
        int notMatched = (patterns.size() - count);
        int additional = password.length() < 6 ? 6 - password.length() - notMatched : 0;
        return notMatched + (additional < 0 ? 0 : additional);
    }
}
