import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ghufran on 3/18/17.
 */
class Problem003LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void lengthOfLongestSubstring1() {
        String testString = "abcabcbb";
        assertEquals(3, Problem003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(testString));

    }
    
    @Test
    void lengthOfLongestSubstring2() {
        String testString = "bbbbb";
        assertEquals(1, Problem003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(testString));

    }
    
    @Test
    void lengthOfLongestSubstring3() {
        String testString = "pwwkew";
        assertEquals(3, Problem003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(testString));

    }
    
    @Test
    void lengthOfLongestSubstring4() {
        String testString = "";
        assertEquals(0, Problem003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(testString));

    }
    
    @Test
    void lengthOfLongestSubstring5() {
        String testString = "dvdf";
        assertEquals(3, Problem003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(testString));
    }

    @Test
    void lengthOfLongestSubstring6() {
        String testString = "abba";
        assertEquals(2, Problem003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(testString));
    }

}