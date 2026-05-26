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
    private List<Integer> results;
    
    public List<Integer> inorderTraversal(TreeNode root) {
        results = new ArrayList<Integer>();
        
        addInt(root);

        return results;
    }

    public void addInt(TreeNode root) {
        if (root == null) {
            return;
        }

        addInt(root.left);
        results.add(root.val);
        addInt(root.right);
    }
}