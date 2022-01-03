// Approach - Sliding Window Approach. The subarray count will be equal to window length.
// Time Complexity - O(n) where n is the array size - ultimately right is moving till end of the array 
                      and left is following the right
// Space Complexity - O(1) as no extra space is used.

// https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/

class Solution {
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int start = 0, end = 0, result = 0;
        long product = 1;
        
        while(end < n){
            product *= a[end];
            while(start < end && product >= k){
                product /= a[start];
                start++;
            }
            if(product < k)
                result += end - start + 1;
            end++;
        }
        return result;
    }
}