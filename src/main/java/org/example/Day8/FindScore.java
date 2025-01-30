/*
2593. Find Score of an Array After Marking All Elements
You are given an array nums consisting of positive integers.

Starting with score = 0, apply the following algorithm:

Choose the smallest integer of the array that is not marked. If there is a tie, choose the one with the smallest index.
Add the value of the chosen integer to score.
Mark the chosen element and its two adjacent elements if they exist.
Repeat until all the array elements are marked.
Return the score you get after applying the above algorithm.



Example 1:

Input: nums = [2,1,3,4,5,2]
Output: 7
Explanation: We mark the elements as follows:
- 1 is the smallest unmarked element, so we mark it and its two adjacent elements: [2,1,3,4,5,2].
- 2 is the smallest unmarked element, so we mark it and its left adjacent element: [2,1,3,4,5,2].
- 4 is the only remaining unmarked element, so we mark it: [2,1,3,4,5,2].
Our score is 1 + 2 + 4 = 7.
Example 2:

Input: nums = [2,3,5,1,3,2]
Output: 5
Explanation: We mark the elements as follows:
- 1 is the smallest unmarked element, so we mark it and its two adjacent elements: [2,3,5,1,3,2].
- 2 is the smallest unmarked element, since there are two of them, we choose the left-most one, so we mark the one at index 0 and its right adjacent element: [2,3,5,1,3,2].
- 2 is the only remaining unmarked element, so we mark it: [2,3,5,1,3,2].
Our score is 1 + 2 + 2 = 5.


Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 106
 */

package org.example.Day8;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class FindScore {



    public static long findScore(int[] nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(int i=0;i<nums.length;i++) {
            pq.offer(new int[] {nums[i], i});
        }
        long score = 0;
        Set<Integer> set  = new HashSet<Integer>();

        while(!pq.isEmpty() && set.size() != nums.length) {
            int[] top = pq.poll();
            if(set.contains(top[1])) {
                continue;
            }
            score += top[0];

            if(top[1] - 1 >= 0)
                set.add(top[1] -1);

            if(top[1] + 1 < nums.length)
                set.add(top[1] + 1);
        }

        return score;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,4,5,2};
        findScore(nums);
    }
}
