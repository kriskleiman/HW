package com.company;

public class Palindrome {
    public static void main(String args[]) {
        int x = 424;
        int remainder, reverse = 0, palindrome;
        palindrome = x;

        while (x != 0) {
            remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        if (palindrome == reverse) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }
}




