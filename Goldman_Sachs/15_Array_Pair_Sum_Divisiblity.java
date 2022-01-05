// Approach - find frequency of the remainders and check for 3 cases, 
              If remainder is 0 and remainder is k/2 it should have even frequency value. 
              Else, the frequency should be equal to k-remainder's frequency.
// Time Complexity - O(n) where n is length of array
// Space Complexity - O(n) as we have used an extra hashmap.

// https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1/#

class Solution {
    public boolean canPair(int[] nums, int k) {
        // remainder-frequency map
        HashMap<Integer,Integer> rfMap = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
            int remainder = nums[i]%k;
            // old-frequency
            //getOrDefault - if found the key returns value, else returns 0
            int of = rfMap.getOrDefault(remainder, 0);
            rfMap.put(remainder, of+1);
        }
        
        for(int val : nums){
            int remainder = val%k;
            if(remainder == 0){
                int freq = rfMap.get(remainder);
                if(freq%2 != 0 )
                    return false;
            }
            // because odd values when divided gives int result.
            else if(2*remainder == k ){
                int freq = rfMap.get(remainder);
                if(freq%2 != 0)
                    return false;
            }
            else{
                int freq = rfMap.get(remainder); 
                int otherFreq = rfMap.getOrDefault(k-remainder,0);
                if(freq != otherFreq)
                    return false;
            }
        }
        return true;
    }
}
