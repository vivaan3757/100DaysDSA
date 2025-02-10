/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
 */



package org.example.Day13;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] arr) {

        int index = 0;
        StringBuilder res = new StringBuilder();
        outloop:
        while(true) {
            if(index >= arr.length)
                break;

            char ch = arr[0].charAt(index);
            for(String s : arr) {
                if(index > s.length() || s.charAt(index) != ch)
                    break outloop;
            }
            res.append(ch);
            index++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"flower","cat","dog"};
        System.out.println(longestCommonPrefix(arr));
    }
}
