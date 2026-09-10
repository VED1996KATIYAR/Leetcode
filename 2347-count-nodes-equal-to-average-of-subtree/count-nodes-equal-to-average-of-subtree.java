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
    
    
    private int matchingNodesCount = 0;

    public int averageOfSubtree(TreeNode root) {
        matchingNodesCount = 0;
        calculateSubtreeDetails(root);
        return matchingNodesCount;
    }

    
    private int[] calculateSubtreeDetails(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        
        int[] leftSubtree = calculateSubtreeDetails(node.left);
        int[] rightSubtree = calculateSubtreeDetails(node.right);

        
        int totalSum = leftSubtree[0] + rightSubtree[0] + node.val;
        int totalCount = leftSubtree[1] + rightSubtree[1] + 1;

      
        int average = totalSum / totalCount;

        
        if (node.val == average) {
            matchingNodesCount++;
        }

        return new int[]{totalSum, totalCount};
    }
}
