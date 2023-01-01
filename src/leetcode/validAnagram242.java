package src.leetcode;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */



// 256 and '0' for unicode character
public class validAnagram242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        int[] s1 = new int[256];
        for(int i=0 ; i<s.length() ;i++){
            s1[s.charAt(i)-'0']++;
            s1[t.charAt(i)-'0']--;
        }
        for(int i=0; i<256; i++){
            if (s1[i] > 0) return false;
        }
        return true;
    }
}
