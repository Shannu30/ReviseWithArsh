// Approach - Traverse through the array and sum elements and check for condition sum>=target. if yes, increment left pointer and revert back the sum.
// Time Complexity - O(N) where N is length of array
// Space Complexity - O(1)

// https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            while(sum >= target){
                result = Math.min(result, i-left+1);
                sum -= nums[left];
                left++;
            }  
        }
        
        return (result!= Integer.MAX_VALUE)? result : 0 ;
        
    }
}
