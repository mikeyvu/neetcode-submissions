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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (sameTree(root, subRoot)) {
            return true;
        }

        if(root.left != null && isSubtree(root.left, subRoot)) {
            return true;
        }
        
        if(root.right != null && isSubtree(root.right, subRoot)) {
            return true;
        }

        return false;
    }

    public boolean sameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if(root1 == null || root2 == null ||root1.val != root2.val) {
            return false;
        }

        if (!sameTree(root1.left, root2.left)){
            return false;
        }

        if (!sameTree(root1.right, root2.right)){
            return false;
        }

        return true;
    }
}
