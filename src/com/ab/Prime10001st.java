package com.ab;

import java.util.ArrayList;
import java.util.List;

public class Prime10001st {
    /*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
    */

    public static void main(String[] args) {
        System.out.println(findPrime(10001));
    }


    private static Long findPrime(int order) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            boolean flag_prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag_prime = false;
                    break;
                }
            }
            if (flag_prime) {
                primes.add(i);
            }
            if (primes.size() == order) {
                break;
            }
        }
        return Long.valueOf(primes.get(primes.size() - 1));
    }
}
