// Approach - Stack - pop if ']' and push if '['
// Time Complexity - O(M*N) where M is length of the string and N is number of characters in the string.
// Space Complexity - O(N + N + M) = O(2N + M) = O(N + M). where N for max length of StringBuilder(only letters), 
                                        // another N for wordStack and M for Count Stack.

// https://practice.geeksforgeeks.org/problems/decode-the-string2444/1

class Solution{
    static String decodedString(String s){
        Stack<Integer> countStack = new Stack<Integer>();
        Stack<String> wordStack = new Stack<String>();
        int number = 0;
        StringBuilder word = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(Character.isDigit(c) ){
                number = number *10 + (c - '0');
            }else if(Character.isLetter(c)){
                word.append(c);
            }else if(c == '['){
                countStack.add(number);
                wordStack.add(word.toString());
                number = 0;
                word = new StringBuilder();
            }else{
                int count = countStack.pop();
                StringBuilder duplicatedWord = new StringBuilder(wordStack.pop());
                
                for(int j=0;j<count;j++) duplicatedWord.append(word);
                word = duplicatedWord;
            }
        }
        return word.toString();
    }
}
