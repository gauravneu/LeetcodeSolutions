package src.leetcode;

import java.util.HashMap;
import java.util.Stack;


/*
EASY

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Example 1:
Input: s = "()"
Output: true
Example 2:
Input: s = "()[]{}"
Output: true
Example 3:
Input: s = "(]"
Output: false
Constraints:1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */


public class validParentheses20 {
    public boolean isValid(String s) {
        HashMap<Character, Character> hs = new HashMap<>();
        hs.put('(', ')');
        hs.put('{', '}');
        hs.put('[', ']');
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {

            // if(!st.empty()){
            //     System.out.println(hs.get(st.peek()));
            // }

            if (hs.containsKey(c)) {
                st.add(c);
            } else if (st.empty()) {
                return false;
            } else {
                if (c == hs.get(st.peek())) {
                    st.pop();
                } else if (c != hs.get(st.peek())) {
                    return false;
                }
            }
        }
        return st.empty();
    }
}
