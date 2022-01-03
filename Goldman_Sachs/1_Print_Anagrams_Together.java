// Approach - outer hashmap for checking the anagrams, inner hashmap for checking the frequencies.
// Time Complexity - O(MN) where M-length of the strings and N-length of string array.
// Space Complexity - O(MN) where M-Maximum of No.of characters in each string and N-No.of words in string array.

// https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        
        HashMap<HashMap<Character, Integer>, ArrayList<String>> outerMap 
        = new HashMap<HashMap<Character, Integer>, ArrayList<String>>();
        
        for(String string : string_list){
            
            HashMap<Character, Integer> innerMap = new HashMap<Character, Integer>();
            for(int i=0;i<string.length();i++){
                if(innerMap.containsKey(string.charAt(i))){
                    int x = innerMap.get(string.charAt(i));
                    innerMap.put(string.charAt(i), x+1);
                }else{
                    innerMap.put(string.charAt(i), 1);
                }
            }
            
            if(outerMap.containsKey(innerMap)){
                ArrayList<String> strList = outerMap.get(innerMap);
                strList.add(string);
                outerMap.put(innerMap,strList);
            }else{
                ArrayList<String> list = new ArrayList<String>();
                list.add(string);
                outerMap.put(innerMap,list);
            }
            
        }
        
        List<List<String>> result = new ArrayList<List<String>>();
        
        for(HashMap<Character,Integer> temp : outerMap.keySet()){
            result.add(outerMap.get(temp));
        }
        return result;
    
    }
}