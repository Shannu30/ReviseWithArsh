// Approach - find the position for the linear and then % it for circle. 
		If it is 0 then the answer is the last position in the circle.
// Time Complexity - O(1)
// Space Complexity - O(1)

// https://practice.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1

class Solution {
    static int findPosition(int circle_Size , int no_of_Items , int start_Position) {
        int dist = start_Position + no_of_Items - 1;
        int position = dist%circle_Size;
        if(position == 0) return circle_Size;
        else
            return position;
    }
};