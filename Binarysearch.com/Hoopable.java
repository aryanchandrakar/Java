/*
Hoppable

Given an integer list nums where each number represents the maximum number of hops you can make, determine whether you can reach to the last index starting at index 0.

Constraints

n ≤ 100,000 where n is the length of nums.
Example 1
Input
nums = [1, 0, 0, 0]
Output
false
Example 2
Input
nums = [2, 4, 0, 1, 0]
Output
true
Explanation
We can jump from index 0 to 1, and then jump to the end.

Example 3
Input
nums = [1, 1, 0, 1]
Output
false
Explanation
We can't go past index 2 of the array.
*/
import java.util.*;

class Solution {
    public boolean solve(int[] A) {
         if(A.length <= 1)
        return true;
 
        int max = A[0]; //max stands for the largest index that can be reached.
    
        for(int i=0; i<A.length; i++){
            //if not enough to go to next
            if(max <= i && A[i] == 0) 
                return false;
    
            //update max    
            if(i + A[i] > max){
                max = i + A[i];
            }
    
            //max is enough to reach the end
            if(max >= A.length-1) 
                return true;
        }
    
        return false;
    }
}
