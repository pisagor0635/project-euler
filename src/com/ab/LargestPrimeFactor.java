package com.ab;

public class LargestPrimeFactor {
    /*
    The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
    */
    public static void main(String[] args) {
        long n =600851475143L;
        if (isPrime(n)){
            System.out.println("Largest Prime Factor : " + n);
            return;
        }
        for (long i = (long) Math.sqrt(n); i > 1; i--) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    System.out.println("Largest Prime Factor : " + i);
                    break;
                }
            }
        }
    }
    private static boolean isPrime(long n) {
        boolean result = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
