package com.leetcode;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        String result1 = Arrays.toString(twoSumBruteForce(nums1, target1));


        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        String result2 = Arrays.toString(twoSumBruteForce(nums2, target2));

        int[] nums3 = {3, 3};
        int target3 = 6;
        String result3 = Arrays.toString(twoSumBruteForce(nums3, target3));

        System.out.println("Result: " + result1);
        System.out.println("Result: " + result2);
        System.out.println("Result: " + result3);
    }


    static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Parâmetros de entrada inválidos");
    }
}
