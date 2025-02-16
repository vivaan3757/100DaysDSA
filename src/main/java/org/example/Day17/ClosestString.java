/*
Given a list of words followed by two words, the task is to find the minimum distance between the given two words in the list of words.

Examples:


Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
Output: 3
Explanation: Minimum distance between the words “the” and “fox” is 3


Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
Output: 2
Explanation: Minimum distance between the words “geeks” and “practice” is 2
 */


package org.example.Day17;

public class ClosestString {

    public static int closestString(String[] str, String s1, String s2){
        boolean flag = false;
        int index1 = 0;
        int index2 = 0;
        boolean flag1 = false;
        int res = 0;
        for(int i=0;i<str.length;i++) {
            if(str[i] == s1) {
                index1 = i;
                flag = true;
            }
            if(str[i] == s2) {
                index2 = i;
                flag1 = true;
            }
            if(flag == true && flag1 == true) {
                res = Math.abs(index2-index1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] str = {"geeks", "for", "geeks", "contribute","geeks",  "practice"};
        String s1 = "geeks";
        String s2 = "practice";
        System.out.println(closestString(str,s1,s2));
    }
}
