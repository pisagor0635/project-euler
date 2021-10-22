package com.ab;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MultiplesOf3And5 {
    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
    */

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                numbers.add(i);
            } else if (i % 5 == 0) {
                numbers.add(i);
            }
        }

        int sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);

    }
}
