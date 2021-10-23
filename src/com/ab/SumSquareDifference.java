package com.ab;

public class SumSquareDifference {
    /*
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    */
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += (int) Math.pow(i, 2);
            sum += i;
        }
        int squareOfSums = (int) Math.pow(sum, 2);

        int difference = squareOfSums - sumOfSquares;
        System.out.println(difference);
    }
}
