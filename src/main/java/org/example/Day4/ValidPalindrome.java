/*
125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */

package org.example.Day4;

public class ValidPalindrome {

    public static boolean isValid(String str) {
        if(str.isEmpty()) return true;

        int low = 0;
        int high = str.length()-1;

        while(low<=high) {
            if(!Character.isLetterOrDigit(str.charAt(low)))
                low++;
            else if(!Character.isLetterOrDigit(str.charAt(high)))
                high--;
            else {
                if(Character.toLowerCase(str.charAt(low)) != Character.toLowerCase(str.charAt(high)))
                    return false;
                low++;
                high--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("A man, a plan, a canal: Panama"));
    }
}
