package src.leetcode;

public class validPalindromeII680 {
    /*
    EASY

    Given a string s, return true if the s can be palindrome
    after deleting at most one character from it.

Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
     */

    public boolean validPalindrome(String s) {
        char[] ch = s.toCharArray();
        boolean r = true;
        int j = s.length() - 1;
        int i = 0;
        while (i < j && r) {
            if (ch[i] == ch[j]) {
                i++;
                j--;
            } else {
                //  System.out.println("kj");
                r = (isPalindrome(ch, i + 1, j) || isPalindrome(ch, i, j - 1));
                break;
            }
        }
        return r;

    }

    boolean isPalindrome(char[] s, int i, int j) {
        while (i < j) {
            if (s[i] != s[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
