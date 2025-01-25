/*
350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000


Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */

package org.example.Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] num1, int[] num2) {

        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        for(int i=0;i<num1.length;i++) {
            if(hm1.containsKey(num1[i])) {
                hm1.put(num1[i],hm1.get(num1[i])+1);
            }
            else
                hm1.put(num1[i],1);
        }

        for(int i=0;i<num2.length;i++) {
            if(hm2.containsKey(num2[i])) {
                hm2.put(num2[i],hm2.get(num2[i])+1);
            }
            else
                hm2.put(num2[i],1);
        }
        for(Integer key : hm1.keySet()) {
            if(hm2.containsKey(key)) {
                int num = Math.min(hm2.get(key),hm1.get(key));
                while(num-->0)
                    arr.add(key);
            }
        }

        int[] res = new int[arr.size()];
        for(int i=0;i<arr.size();i++)
            res[i] = arr.get(i);


        return res;
    }


    public static void main(String[] args) {
        int[] arr1 ={1,2,2,1};
        int[] arr2 = {2,2};
        intersect(arr1,arr2);
    }
}
