/*
7. Reverse Integer
        Medium
        Topics
        Companies
        Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



        Example 1:

        Input: x = 123
        Output: 321
        Example 2:

        Input: x = -123
        Output: -321
        Example 3:

        Input: x = 120
        Output: 21


        Constraints:

        -231 <= x <= 231 - 1
        */

package org.example.Day2;

public class Leet7 {

    public static int reverse(int n) {
        int temp1 = n;
        if(n<0)
            temp1 = -1*n;
        long res = 0;
        int temp = 0;
        while(temp1>0) {
            temp = temp1%10;
            res = (res * 10) + temp;
            temp1 = temp1 / 10;
        }

        if(Integer.MIN_VALUE > res || res > Integer.MAX_VALUE ) {
            return 0;
        }

        int res1 = (int)res;

        if( n < 0 ) {
            res1 = -1 * (int)res;
        }
        return res1;
    }

    public static void main(String[] args) {
        int n = 120;
        System.out.println(reverse(n));
    }
}
