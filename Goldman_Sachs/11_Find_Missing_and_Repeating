// Approach - consider the numbers as index
// Time Complexity - O(N) where N is number of array elements.
// Space Complexity - O(1)

// https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int missing=0, repeating=0;
        
        // find repeating
        for(int i=0;i<n;i++){
            if(arr[Math.abs(arr[i])-1] < 0){
                repeating = Math.abs(arr[i]);
            }else{
                arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
            }
        }
        
        // find missing number
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                missing = i+1;
            }
        }
        
        // return the elements
        int res[] = new int[2];
        res[0]= repeating;
        res[1] = missing;
        return res;
    }
}
