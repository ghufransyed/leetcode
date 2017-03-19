 /*
 Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.k
 */

import java.util.HashMap;

public class Problem003LongestSubstringWithoutRepeatingCharacters {
    
    public static int lengthOfLongestSubstring(String s) {
        
        char[] input = s.toCharArray();
        int maxSubstringStart = 0;
        int maxSubstringEnd = 0;
        int currentSubstringLength = maxSubstringEnd - maxSubstringStart;
        int maxLengthSoFar = 0;
        HashMap lettersSoFar = new HashMap(); // store index of last encountered letter
        
        for (int i = 0 ; i < input.length; i++ ){
           if (lettersSoFar.containsKey(input[i])){
               maxSubstringStart = Math.max((int) lettersSoFar.get(input[i]) + 1, maxSubstringStart);
               maxSubstringEnd = i + 1;
           }
           else {
               maxSubstringEnd++;
           }
           lettersSoFar.put(input[i], i);
           
           currentSubstringLength = maxSubstringEnd - maxSubstringStart;
           if (currentSubstringLength > maxLengthSoFar){
               maxLengthSoFar = currentSubstringLength;
           }
        }
        return maxLengthSoFar;
    }
}
