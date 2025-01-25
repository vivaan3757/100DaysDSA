/*
leet code 277
Find the celebrity
 */

package org.example.Day3;

import java.util.Scanner;
import java.util.Stack;

public class FindCelebrity {

    public static int findCelebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        // Add all ith indexs to stack
        for(int i=0;i< arr.length;i++) {
            st.push(i);
        }

        while(st.size() >= 2)
        {
            int i= st.pop();
            int j= st.pop();

            if(arr[i][j] == 1)
                // if i know j thn I is not a celebrity and push j
                st.push(j);
            else
                // if i doesn't know h then j is not a celebrity and push i
                st.push(i);
        }

        // pot might be the potential celebrity and check if it is or not
        int pot = st.pop();
        for(int i=0;i<arr.length;i++) {
            if(i!=pot) {
                // why we kept arr[i][pot] == 0 is we know from question statement that diagonal element always 0
                if(arr[i][pot] == 0 || arr[pot][i] ==1)
                    return -1;
            }
        }
        return pot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<4;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findCelebrity(arr));
    }
}
