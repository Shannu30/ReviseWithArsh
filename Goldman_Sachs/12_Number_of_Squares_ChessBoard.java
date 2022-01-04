// Approach - Direct formula - sum of squares of n numbers
// Time Complexity - O(1)
// Space Complexity - O(1)

// https://www.geeksforgeeks.org/program-to-find-number-of-squares-on-a-chessboard/

class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = (n*(n + 1)*(2 * n + 1))/ 6; 
		
		System.out.println(result);
	}
}
