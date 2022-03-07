package com.kkleiman.HW1;

public class LastWordLength {
    public static void main(String[] args) {
        String s = "Hello This Cruel World"; {
           s.trim().length();
           s.trim().lastIndexOf("");
           System.out.println(s.trim().length() - s.trim().lastIndexOf(" ") - 1);

        }

    }
}
