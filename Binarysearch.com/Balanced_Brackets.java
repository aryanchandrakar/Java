/*
Balanced Brackets
You're given a string s consisting solely of "(" and ")". Return whether the parentheses are balanced.

Constraints

n ≤ 100,000 where n is the length of s.
Example 1
Input
s = "()"
Output
true
Example 2
Input
s = "()()"
Output
true
Example 3
Input
s = ")("
Output
false
Example 4
Input
s = ""
Output
true
Example 5
Input
s = "((()))"
Output
true
Example 6
Input
s = "((()"
Output
false
*/
import java.util.*;

class Solution {
    public boolean solve(String s) {
        int count=0;
        boolean flag=true;
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(Character.compare(c,'(')==0){
                count++;
            }
            else{
                count--;
                if(count<0){
                    flag=false;
                }
            }
        }
        if(count==0 & flag==true){
            return true;
        }
        else{
            return false;
        }
    }
}
