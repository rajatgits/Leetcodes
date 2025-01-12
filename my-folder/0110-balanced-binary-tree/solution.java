/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        if(height(root.left) == -1) {
            return -1;
        }

        if(height(root.right) == -1) {
            return -1;
        }

        if(Math.abs(height(root.left) - height(root.right)) > 1) {
            return -1;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }
}
