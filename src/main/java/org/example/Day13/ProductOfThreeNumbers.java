/*
628. Maximum Product of Three Numbers
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.


Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6


Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000
 */


package org.example.Day13;

import java.util.Arrays;

public class ProductOfThreeNumbers {


    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max((nums[0]*nums[1]*nums[nums.length-1]), (nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(maximumProduct(arr));
    }
}
