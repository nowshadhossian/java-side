package main.java;

import java.util.*;

public class Romanizer {

    TreeMap<Integer, String> map = new TreeMap<>();
    {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");


    }
    public static void main(String []a){
        new Romanizer().de();

    }

    private void de() {
        List<Integer> number = new ArrayList<>();
        number.add(99);
        number.add(2);
        number.add(5);
        List<String> roman = romanizer(number);
        roman.forEach(System.out::println);


    }


    public   List<String> romanizer(List<Integer> numbers) {
        List<String> roman = new ArrayList<>();

        for(int number : numbers){
            roman.add(toRoman(number));
        }

        return roman;

    }

    public   String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }

}
