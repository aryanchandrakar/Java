/*
Given a list of integers nums, return a new list such that each element at index i of the new list is the product of all the numbers in the original list except the one at i. Do this without using division.

Constraints

2 ≤ n ≤ 100,000 where n is the length of nums
Example 1
Input
nums = [1, 2, 3, 4, 5]
Output
[120, 60, 40, 30, 24]
Explanation
120 = 2 * 3 * 4 * 5, 60 = 1 * 3 * 4 * 5, and so on.

Example 2
Input
nums = [3, 2, 1]
Output
[2, 3, 6]
*/
import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int n=nums.length;
        int[] mul=new int[n];
        int before,after;
        for(int i=0;i<n;i++){
             before=1;after=1;
            for(int j=0;j<i;j++){
                before=before*nums[j];
            }
            for(int j=i+1;j<n;j++){
                after=after*nums[j];
            }
            mul[i]=before*after;
        }
        
        return mul;
    }
}
