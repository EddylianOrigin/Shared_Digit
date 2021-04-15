package com.company;

/**
 * Write a method named hasSharedDigit with two parameters of
 * type int.
 * Each number should be within the range of 10 (inclusive) - 99
 * (inclusive). If one of the numbers is not within the range, the
 * method should return false
 * the method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23,otherwise, the method should return false;
 */
public class ShareDigit {
public static boolean hasSharedDigit(int a,int b) {
    int c = 0;
    int d = b;
    if (a < 10 || b < 10 || a > 99 || b > 99) {
        return false;
    } else {
        while (a > 0) {
            c = a % 10;
            while (b > 0) {
                if (c == (b % 10)) {
                    return true;
                } else {
                    b /= 10;
                }
            }
            b = d;
            a /= 10;
        }
    }
    return false;
}
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
	// write your code here
    }
}
