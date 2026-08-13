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
    private Queue<TreeNode> queue = new LinkedList<TreeNode>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        queue.add(p);
        queue.add(q);

        while (queue.size() > 0) {
            TreeNode currP = queue.poll();
            TreeNode currQ = queue.poll();

            if (currP == null && currQ == null) {
                continue;
            }

            if (currP == null || currQ == null ||currP.val != currQ.val ) {
                return false;
            }

            queue.add(currP.left);
            queue.add(currQ.left);
            queue.add(currP.right);
            queue.add(currQ.right);
        }

        return true;
    }
}
