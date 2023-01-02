package src.leetcode;


/*
EASY


A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */



public class validPalindrome125 {
    public boolean isPalindrome(String s) {
        String b = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char s1 : b.toCharArray()) {
        /*
        if(Character.isLetterOrDigit(s1)){
                        sb.append(s1);
                    }
         */
            if ((s1 - 'a' >= 0 && s1 - 'a' < 26) || (s1 - '0' >= 0 && s1 - '0' < 10)) {
                sb.append(s1);
            }
        }

        int i = 0;
        int l = sb.length() - 1;
        for (; i < l; i++, l--) {
            if (sb.charAt(i) != sb.charAt(l)) return false;

        }
        return true;
    }
}
