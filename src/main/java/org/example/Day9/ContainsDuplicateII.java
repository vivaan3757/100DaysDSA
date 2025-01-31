/*
219. Contains Duplicate II
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
 */

package org.example.Day9;

import java.util.HashMap;

public class ContainsDuplicateII {

    public static boolean containsDuplicate(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean res = false;

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i) <=k) {
                    res = true;
                }
            }
            map.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int k =2;
        System.out.println(containsDuplicate(arr,k));
    }
}
