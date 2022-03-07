package com.kkleiman.HW1;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {1, 15, 48, 36};
        int target = 51;
        int [] result = new int [2];

        for (int i = 0; i < nums.length-1; i++) {
            for (int temp = i + 1; temp < nums.length; temp++) {
                if (nums[i] + nums[temp] == target) {
                   result[0]=i;
                   result[1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
