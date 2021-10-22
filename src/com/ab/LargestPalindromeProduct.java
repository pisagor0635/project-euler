package com.ab;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LargestPalindromeProduct {
    /*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
    */

    public static void main(String[] args) {
        List<Integer> palindromes = new ArrayList<>();
        out:
        for (int i = 999; i >= 0; i--) {
            for (int j = 999; j >= 0; j--) {
                if (isPalindrome(i * j)) {
                    palindromes.add(i * j);
                }
            }
        }
        Integer max = palindromes.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
        System.out.println(max);
    }

    private static boolean isPalindrome(int number) {
        boolean result = true;
        for (int i = 0; i < String.valueOf(number).length() / 2; i++) {
            if (String.valueOf(number).charAt(i) != String.valueOf(number).charAt(String.valueOf(number).length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
