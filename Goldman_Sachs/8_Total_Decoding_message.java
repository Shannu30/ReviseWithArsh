// Approach - Dynamic Programming - Validate for one digit and second digit
// Time Complexity - O(N) where N is string length
// Space Complexity - O(N) for DP array

// https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/

class Solution
{
    public int CountWays(String str)
    {
        int dp[] = new int[str.length()+1];
        dp[0] = 1;
        dp[1] = str.charAt(0) == '0' ? 0:1;
        int mod = 1000000007;
        for(int i=2; i<=str.length(); i++){
            
            int oneDigit = Integer.valueOf(str.substring(i-1,i));
            int twoDigits = Integer.valueOf(str.substring(i-2,i));
            if(oneDigit >= 1){
                dp[i] += dp[i-1]%mod;
            }
            if(twoDigits >= 10 && twoDigits <= 26){
                dp[i] += dp[i-2]%mod;
            }
        }
        return dp[str.length()]%mod;
        
    }
}
