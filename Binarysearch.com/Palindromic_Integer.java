/*
Given a non-negative integer num, return whether it is a palindrome.

Bonus: Can you solve it without using strings?

Constraints

num < 2 ** 31
Example 1
Input
num = 121
Output
true
Example 2
Input
num = 20200202
Output
true
Example 3
Input
num = 43
Output
false
*/

import java.util.*;
import java.lang.Math;

class Solution {
    public boolean solve(int num) {
        int n=String.valueOf(num).length();
        int[] a=new int[n];
        int p=num;
        int i=0;
        while(p>0){
            a[i]=p%10;
            p=(p-a[i])/10;
            i++;
        }
        int pal=0;
        for(int j=0;j<n;j++){
            pal=pal+((int)Math.pow(10,j))*(a[n-j-1]);
        }
        //System.out.println(pal);
        if(pal==num){return true;}
        else{return false;}
    }
}
