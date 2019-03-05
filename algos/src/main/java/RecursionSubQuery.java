package main.java;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Print
 * N
 * NG
 * NGE
 * G
 * GN
 * GE
 * GEN
 *
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */
public class RecursionSubQuery {

    List<String> results = new ArrayList<>();

    public static void main(String []a){
        new RecursionSubQuery().recursionSubQuery();
    }

    List<List<Integer>> possibilites = new ArrayList<>();


    public void de2(){
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        subQuery(strings);

    }


    /**
     * Iterative
     * Result:
     * ABC
     * ACB
     * CAB
     * CBA
     * BAC
     * BCA
     * @param strings
     */
    private void subQuery(List<String> strings) {
        List<String> answers = new ArrayList<>();
        for(int i=0; i< strings.size(); i++){
            for(int j=0; j< strings.size(); j++){
               for(int k=0; k<strings.size(); k++){
                   if(i == j || i == k || j == k){
                       continue;
                   }
                   answers.add(strings.get(i) + strings.get(j) + strings.get(k));
               }
            }
        }

        answers.forEach(System.out::println);
    }



    Set<String> answers = new HashSet<>();
   public void recursionSubQuery(){
       List<String> strings = new ArrayList<>();
       strings.add("A");
       strings.add("B");
       strings.add("C");
     permute(strings, 0, strings.size());

     answers.forEach(System.out::println);
   }

    /**
     * Recursive
     * Result:
     * ABC
     * ACB
     * CAB
     * CBA
     * BAC
     * BCA
     * @param strings
     */
    private void permute(List<String> strings, int l, int r) {
        if(l == r){
            return;
        }

        for(int i = l; i < strings.size(); i++){
            List<String> swapped  = swap(strings, l, i);
            answers.add(swapped.stream().collect(Collectors.joining()));
            permute(swapped, l + 1, r);
            swapped  = swap(strings, l, i); //backtrack... meaning going to the parent
            answers.add(swapped.stream().collect(Collectors.joining()));
        }
    }

    private List<String> swap(List<String> strings, int l, int i) {
        String temp = strings.get(i);
        strings.set(i, strings.get(l));
        strings.set(l, temp);
        return strings;
    }


}
