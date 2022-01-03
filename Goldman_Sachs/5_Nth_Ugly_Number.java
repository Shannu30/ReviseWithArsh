// Approach - Dynamic Programming solution. Calculating the min of 2,3,5 multiples of ugly number and adding it to the dp array.
// Time Compexity - O(N)
// Space Complexity - O(N)

// https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/

class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        
        long dp[] = new long[n+1];
        dp[1] = 1;
        
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;
        
        for(int i=2;i<n+1;i++){
            long f2 = 2*dp[p2]; // can be calculated in the if condition.
            long f3 = 3*dp[p3]; // can be calculated in the if condition.
            long f5 = 5*dp[p5]; // can be calculated in the if condition.
            
            long min = Math.min(f2, Math.min(f3, f5));
            dp[i] = min;
            
            if(min == f2) p2++;
            if(min == f3) p3++;
            if(min == f5) p5++;
        }
        return dp[n];
    }
}