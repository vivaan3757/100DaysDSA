/*
268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]

Output: 2

Explanation:

n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]

Output: 8

Explanation:

n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.








Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.


Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */

package org.example.Day7;

import java.util.HashSet;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
//        HashSet<Integer> set = new HashSet<Integer>();
//        for(int i=0;i<nums.length;i++)
//            set.add(nums[i]);
//        int n = set.size();
//        while(n>=0) {
//            if(!set.contains(n))
//                return n;
//            n--;
//        }
//        return -1;

         int n = nums.length;
         int ans = (n*(n+1))/2;
         for(int x : nums)
         {
             ans = ans - x;
         }
         return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
}
