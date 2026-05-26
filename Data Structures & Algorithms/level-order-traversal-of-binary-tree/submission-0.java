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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList;
        //queue: first in first out. The one got added first will be retrieved first
        //queue.add to add
        //queue.poll to remove the first element on the left

        if (root != null) {
            queue.add(root);
        }

        while (queue.size() > 0) {
            subList = new ArrayList<>();
            int range = queue.size();
            for (int i = 0; i < range; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

                subList.add(curr.val);
            }
            list.add(subList);
        }

        return list;
    }
}
