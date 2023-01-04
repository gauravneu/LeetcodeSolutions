package src.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
EASY

Given the root of a binary tree, return the
inorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:
Input: root = []
Output: []
Example 3:
Input: root = [1]
Output: [1]
Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */


public class binaryTreeInorderTraversal94 {
    List<Integer> ls = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        inorderTraversal(root.left);
        ls.add(root.val);
        inorderTraversal(root.right);
        return ls;
    }


//    List<Integer> ls = new ArrayList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        helper(root);
//        return ls;
//    }
//    public void helper(TreeNode root ){
//        if(root == null) return;
//        helper(root.left);
//        ls.add(root.val);
//        helper(root.right);
//    }



}
