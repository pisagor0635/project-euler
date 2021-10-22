package com.ab;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciNumbers {
    /*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

    */

    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();

        int sum = 0;
        int i = 0;
        int nextFibonacci = 0;
        fibonacci.add(0);
        fibonacci.add(1);
        do {
            nextFibonacci = fibonacci.get(i) + fibonacci.get(i + 1);
            if (nextFibonacci < 4000000 && nextFibonacci % 2 == 0) {
                sum += nextFibonacci;
            }
            fibonacci.add(nextFibonacci);
            i++;
        } while (nextFibonacci < 4000000);

        System.out.println(sum);
    }
}
