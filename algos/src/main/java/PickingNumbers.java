package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */
public class PickingNumbers {
    public static void main(String[] a) {
        System.out.println(pickingNumbers(List.of(4, 6, 5, 3, 3, 1)));
    }

    public static int pickingNumbers(List<Integer> a) {
        List<List<Integer>> possibilities = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            int numA = a.get(i);
            List<Integer> rows = new ArrayList<>();
            rows.add(numA);
            possibilities.add(rows);
            for (int j = 0; j < a.size(); j++) {
                if (i == j) {
                    continue;
                }
                int numB = a.get(j);
                if (isLessThenOne(rows, numB)) {
                    rows.add(numB);
                }
            }
        }


        return greatestSize(possibilities);
    }

    private static int greatestSize(List<List<Integer>> possibilities) {
        int greatestSize = 0;
        for (List<Integer> rows : possibilities) {
            if (rows.size() > greatestSize) {
                greatestSize = rows.size();
            }
        }
        return greatestSize;
    }

    private static boolean isLessThenOne(List<Integer> rows, int numB) {
        for (int x : rows) {
            if (Math.abs(numB - x) > 1) {
                return false;
            }
        }
        return true;
    }
}
