package com.kkleiman.HW1;

public class DivWithoutOperators {
   public static void solution(int x, int y){
       int div = 0;
       while (x >= y) {
           x = x - y;
           div++;
       }
       System.out.print(div + " " + x);
   }

    public static void main(String[] args) {
        solution(12, 6);
    }
}


