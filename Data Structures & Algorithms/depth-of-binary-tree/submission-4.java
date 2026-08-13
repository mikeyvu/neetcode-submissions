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
    private Queue<TreeNode> queue;
    int level = 0;

    public int maxDepth(TreeNode root) {
        queue = new ArrayDeque<>();

        if (root != null) {
            queue.offer(root);
        }

        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            level++;
        }

        return level;
    }
}
