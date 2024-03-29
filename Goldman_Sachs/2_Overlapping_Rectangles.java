// Approach - check for 4 non overlapping scenarios.
// Time Complexity - O(1)
// Space Complexity - O(1).

// https://practice.geeksforgeeks.org/problems/overlapping-rectangles1924/1/

class Solution {
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        if( R1[1] > L2[1] || R2[1] > L1[1] )
            return 0;
        if( R1[0] < L2[0] || R2[0] < L1[0] )
            return 0;
        return 1;
    }
};