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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int curSum = 0;
        return dfs(root, curSum, targetSum);
    }

    private boolean dfs(TreeNode node, int curSum, int targetSum) {
        if (node == null) {
            return false;
        }
        curSum += node.val;
        if (node.left == null && node.right == null && curSum == targetSum) {
            return true;
        }
        if (dfs(node.left, curSum, targetSum)) {
            return true;
        }
        if (dfs(node.right, curSum, targetSum)) {
            return true;
        }
        curSum -= node.val;
        return false;
    }
}