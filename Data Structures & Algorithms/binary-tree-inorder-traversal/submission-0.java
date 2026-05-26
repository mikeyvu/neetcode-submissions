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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        
        if (root == null) {
            return results;
        }
        while (results.isEmpty()) {
            addInt(root, results);
        }

        return results;
    }

    public void addInt(TreeNode root, ArrayList<Integer> results) {
        if (root == null) {
            return;
        }

        addInt(root.left, results);
        results.add(root.val);
        addInt(root.right, results);
    }
}