package src.leetcode;

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
