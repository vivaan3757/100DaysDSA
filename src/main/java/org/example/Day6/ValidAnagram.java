/*
242. Valid Anagram
Given two strings s and t, return true if t is an
anagram
 of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
package org.example.Day6;

public class ValidAnagram {

    public static boolean isAnagram(String str1, String str2) {
        int[] arr = new int[26];

        for(int c: str1.toCharArray()) {
            arr[c-'a']++;
        }

        for(int c: str2.toCharArray()) {
            arr[c-'a']--;
        }


        for(int i=0;i<26;i++) {
            if(arr[i] != 0 )
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("rat","car"));
    }
}
