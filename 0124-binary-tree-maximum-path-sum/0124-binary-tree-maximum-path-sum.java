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
    private static int MAX_SUM;
    public int maxPathSum(TreeNode root) {
    MAX_SUM=Integer.MIN_VALUE;
        dfs(root);
        return MAX_SUM;
        
        
    }
    private int dfs(TreeNode root){
        if(root==null) return 0;
        
        int leftMax=Math.max(0,dfs(root.left));
        int rightMax=Math.max(0,dfs(root.right));
     MAX_SUM=Math.max(leftMax+rightMax+root.val,MAX_SUM);
        return Math.max(leftMax,rightMax)+root.val;
    }
}