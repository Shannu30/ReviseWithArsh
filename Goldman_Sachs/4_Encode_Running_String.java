// Approach - Encode till the last but one value ans then the last one - to avoid IndexOutOfBound 
// Time complexity - O(N) where N is string length
// Space complexity - O(1)

// https://practice.geeksforgeeks.org/problems/run-length-encoding/1/

class Solution
 {
	String encode(String str)
	{
	    String result = "";
	    int count = 1, i;
        for(i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                result += str.charAt(i-1);
                result += count;
                count = 1;
            }
            
        }
        result += str.charAt(i-1);
        result += count;
        return result;
	}
 }