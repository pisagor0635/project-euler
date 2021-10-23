package com.ab;

public class SmallestMultiple {
    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    */

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            count = 0;
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == 20) {
                System.out.println(i);
                break;
            }
        }
    }
}
