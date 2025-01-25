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
