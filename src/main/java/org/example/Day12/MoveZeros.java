/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */



package org.example.Day12;

public class MoveZeros {


    public static int[] moveZeros(int[] arr) {
        if(arr.length == 1 && arr[arr.length-1] != 0) {
            return arr;
        }
        int j=0;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                arr[j++] = arr[i];
                count++;
            }
        }
        int rem = arr.length - count;
        for(int i=0;i<rem;i++) {
            arr[arr.length - i -1] = 0;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {0,1};
        moveZeros(arr);
    }
}
