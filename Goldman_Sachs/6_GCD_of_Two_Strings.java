// Approach - Recursion. Check for equal conditions and shorten the longest string.
// Time Complexity - O(log(B)) where B is the maximum length of two strings.
// Space Complexity - O(1)

// https://leetcode.com/problems/greatest-common-divisor-of-strings/

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        else if(str1.equals(str2)){
            return str1;
        }
        else if(str1.length() > str2.length()){
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        else{
            return gcdOfStrings(str1, str2.substring(str1.length()));
        }
    }
}